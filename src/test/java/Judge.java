import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Judge {

    static double testScore=0;
    static float sumOfSelectorScore=0;
    static float numOfTestValutated=0;

    public static float getElementScore(Selector selector, Page documentPage) {
        //return doMetricV2(selector,document);
        return doMetricV3(selector,documentPage);
    }

    private static float doMetricV3(Selector selector, Page documentPage) {
        Document document=documentPage.getPage();
        float elementScore=-1;
        float complexitySelectorScore=-1;
        //Calcola punteggio:
        //Vedere diagramma di flusso
        String type=selector.getType();
        String selectorString=selector.getSelector();

        // Calcola punteggio di complessità della pagina
        float complexityPageScore = documentPage.getPageComplexity();

        switch (type){
            case "url":
                if(isPartialUrl(selector))complexitySelectorScore=0;
                else complexitySelectorScore=4;
                break;
            case "Id":
                complexitySelectorScore=SelectorComplexityEvaluator.evaluateIdSelectorComplexity(selectorString);;
                break;
            case "CssSelector":
                complexitySelectorScore=SelectorComplexityEvaluator.evaluateCssSelectorComplexity(selectorString);

                break;
            case "XPath":
                complexitySelectorScore=SelectorComplexityEvaluator.evaluateXPathSelectorComplexity(selectorString);
                if(!isXPathAbsolute(selector.getSelector()))elementScore-=1;

                break;
            case "TagName":
                complexitySelectorScore=SelectorComplexityEvaluator.evaluateTagNameSelectorComplexity(selectorString);
                if(!isTagMultiple(selector,document))complexitySelectorScore-=1;
                break;
            case "LinkText":
                complexitySelectorScore=SelectorComplexityEvaluator.evaluateLinkTextSelectorComplexity(selectorString);
                break;
            default:
                complexitySelectorScore=8;
        }
        selector.setSelectorComplexity(complexitySelectorScore);

        //Il punteggio è inversamente propozionato alla complessità del selettore/pagina
        elementScore=Math.abs(complexitySelectorScore-10);
        float pageScore = Math.abs(complexityPageScore - 10);

        documentPage.setPageScore(pageScore);
        selector.setSelectorScore(elementScore);

        // Ponderazione per combinare i punteggi del selettore e di complessità
        float selectorWeight = 0.8f; // Peso del punteggio del selettore (puoi regolare il valore)
        float PageWeight = 0.2f; // Peso del punteggio di complessità (puoi regolare il valore)

        // Combina i punteggi ponderati del selettore e di complessità per ottenere il punteggio finale
        float totalScore = (selectorWeight * elementScore) + (PageWeight * pageScore);


        return totalScore;
    }

    private static float doMetricV2(Selector selector, Document document) {
        float elementScore=-1;
        //Calcola punteggio:
        //Vedere diagramma di flusso
        String type=selector.getType();
        switch (type){
            case "url":
                if(isPartialUrl(selector))elementScore=10;
                else elementScore=6;
                break;
            case "Id":
                elementScore=10;
                break;
            case "CssSelector":
                elementScore=6;
                //if(canBeIdWithCss(selector,document))elementScore-=2;
                break;
            case "XPath":
                elementScore=4;
                //if(canBeIdWithXPath(selector,document))elementScore-=3;
                if(!isXPathAbsolute(selector.getSelector()))elementScore-=1;
                break;
            case "TagName":
                elementScore=6;
                if(!isTagMultiple(selector,document))elementScore-=1;
                break;
            case "LinkText":
                elementScore=4;
                break;
            default:
                elementScore=3;
                break;
        }
        return elementScore;
    }

    private static boolean isPartialUrl(Selector selector) {
        String urlString=selector.getSelector();
        try {
            URL url = new URL(urlString);
            String scheme = url.getProtocol();
            String host = url.getHost();

            return (scheme == null || host == null);
        } catch (MalformedURLException e) {
            return false;
        }
    }

    private static boolean isTagMultiple(Selector selector, Document document) {
        return document.select(selector.getSelector()).size() >1;
    }

    private static boolean canBeIdWithCss(Selector selector, Document document) {
        Elements elements=document.select(selector.getSelector());
        for (Element element:elements) {
            if(!element.hasAttr("id")) return true;
        }
        return false;
    }
    private static boolean canBeIdWithXPath(Selector selector, Document document) {
        org.w3c.dom.Document doc = null;
        TagNode tagNode = new HtmlCleaner().clean(document.toString());
        try {
            doc = new DomSerializer(new CleanerProperties()).createDOM(tagNode);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        XPath xpath = XPathFactory.newInstance().newXPath();
        Node result = null;
        String str = null;
        try {
            result= (Node) xpath.evaluate(selector.getSelector(),doc, XPathConstants.NODE);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        // Ottieni l'elenco degli attributi
        NamedNodeMap attributes = result.getAttributes();

        // Verifica se l'attributo "id" è presente
        return attributes.getNamedItem("id") != null;
    }

    private static boolean canBeCssSelectorWithXPath(Selector selector, Document document) {
        //TODO:
        return false;
    }
    public static boolean isXPathAbsolute(String xpath) {
        return xpath.startsWith("/");
    }


    public static float getBadElementScore(Selector lastSelector) {
        //Calcola punteggio quando il selettore è il responsabile del fallimento:
        //Togliamo 100 punti dal punto calcolato da getElementScore()!
        return lastSelector.getSelectorScore()-100;
    }

    public static double getTestScoreGeometry(Test test) {


            double prodotto = 1;
            int n = test.getSelectors().size();

            for (Selector tes : test.getSelectors()) {
                double numtes=tes.getSelectorFinalScore();
                prodotto *= numtes;
            }
            //System.out.println("Punteggio Test Num "+numOfTestValutated+" Calcolo: "+prodotto+"^(1/"+n+") \n" );
            return Math.pow(prodotto, 1.0 / n);
        }

    public static double getTestScore(Test test) {
        double sumInverseScores = 0;
        int n = test.getSelectors().size();

        for (Selector tes : test.getSelectors()) {
            double numtes = tes.getSelectorFinalScore();
            sumInverseScores += 1.0 / numtes;
        }

        numOfTestValutated += 1;
        double harmonicMean = n / sumInverseScores;


        //Media geometrica
        double geometryMean= getTestScoreGeometry(test);
        //Media Aritmentica
        double arithmeticMean= getTestScoreAritmetich(test);
        //Media Quadratica
        double quadraticMean= getTestScoreQuadraticMean(test);


        //Stampa per il confronto delle medie
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.00",symbols);
        System.out.println("Punteggio Test Num " + numOfTestValutated + ": \n" +
                "CalcoloGeometrico: " + df.format(geometryMean) + " CalcoloArmonico: " + df.format(harmonicMean) +
                " CalcoloAritmentico: " + df.format(arithmeticMean) +"CalcoloQuadratico: " + df.format(quadraticMean) +  "\n");

        return harmonicMean;
    }

    private static double getTestScoreAritmetich(Test test) {
        double sumScores = 0;
        int n = test.getSelectors().size();

        for (Selector tes : test.getSelectors()) {
            double numtes = tes.getSelectorFinalScore();
            sumScores += numtes;
        }

        double arithmeticMean = sumScores / n;

        // Stampa per debug
        // System.out.println("Punteggio Test Num " + numOfTestValutated + " Calcolo: " + arithmeticMean + "\n");

        return arithmeticMean;
    }

    public static double getTestScoreQuadraticMean(Test test) {
        double sumSquares = 0;
        int n = test.getSelectors().size();

        for (Selector tes : test.getSelectors()) {
            double numtes = tes.getSelectorFinalScore();
            sumSquares += Math.pow(numtes, 2);
        }
        double quadraticMean = Math.sqrt(sumSquares / n);

        // Stampa per debug
        // System.out.println("Punteggio Test Num " + numOfTestValutated + " Calcolo: " + quadraticMean + "\n");

        return quadraticMean;
    }

    /*
    public static float getTestScoreGeometry(Test test) {
        float arithmeticAverage;
        float wasteAverage;
        arithmeticAverage=arithmeticAverage(test);
        wasteAverage=wasteAverage(test,arithmeticAverage);
        System.out.println(wasteAverage);
        testScore=0;
        sumOfSelectorScore=0;
        int numberOfSelector=0;


        for (Selector selector:test.getSelectors()) {
            System.out.println(""+(wasteAverage+arithmeticAverage)+" > "+selector.getSelectorScore());
            if(selector.getSelectorScore()<=wasteAverage+arithmeticAverage){
                sumOfSelectorScore+=selector.getSelectorScore();
                numberOfSelector+=1;
            }
        }

        testScore=sumOfSelectorScore/numberOfSelector;

        return testScore;
    }
     */

    private static float wasteAverage(Test test, float arithmeticAverage) {
        float testWaste;
        float sumOfSelectorWaste = 0;
        int numberOfSelector=test.getSelectors().size();

        for (Selector selector:test.getSelectors()) {
            sumOfSelectorWaste+=Math.abs(selector.getSelectorScore()-arithmeticAverage);
        }
        testWaste=sumOfSelectorWaste/numberOfSelector;
        return testWaste;
    }

    private static double arithmeticAverage(Test test) {
        testScore=0;
        sumOfSelectorScore=0;
        int numberOfSelector=test.getSelectors().size();
        //Calcola punteggio:
        //Il punteggio di un test è la media aritmetica dei suoi selettori
        for (Selector selector:test.getSelectors()) {
            sumOfSelectorScore+=selector.getSelectorScore();
        }
        testScore=sumOfSelectorScore/numberOfSelector;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);
        String textScore= df.format(testScore);
        testScore = Double.parseDouble(textScore);
        return testScore;
    }
}
