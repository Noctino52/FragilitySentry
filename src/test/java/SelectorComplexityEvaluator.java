import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectorComplexityEvaluator {

    // Metodo per valutare la complessità di un selettore Id
    public static int evaluateIdSelectorComplexity(String selectorString) {
        //E' la cosa più semplice che puoi fare
        return 0;
    }
    // Metodo per valutare la complessità di un selettore Name
    public static int  evaluateTagNameSelectorComplexity(String selectorString) {
        return 5;
    }

    public static int evaluateLinkTextSelectorComplexity(String selectorString) {
        return 6;
    }

    // Metodo per valutare la complessità di un selettore CSS
    public static float evaluateCssSelectorComplexity(String cssSelector, Document document) {
        // Valuta la complessità del selettore CSS in base alla sua struttura e alla complessità della pagina
        float selectorScore = countCssSelectorComplexity(cssSelector,document);

        // Normalizza il punteggio del selettore nell'intervallo 1-10 in base al punteggio complessivo della pagina
        //int normalizedScore = normalizeScore(selectorScore);

        if(selectorScore>10)selectorScore=10;
        return selectorScore;
    }

    // Metodo per valutare la complessità di un selettore XPath
    public static float evaluateXPathSelectorComplexity(String xpathSelector, Document document) {
        // Valuta la complessità del selettore XPath in base alla sua struttura e alla complessità della pagina
        float selectorScore = countXPathSelectorComplexity(xpathSelector,document);

        // Normalizza il punteggio del selettore nell'intervallo 1-10 in base al punteggio complessivo della pagina
        //int normalizedScore = normalizeScore(selectorScore);

        if(selectorScore>10)selectorScore=10;
        return selectorScore;
    }

    private static float countCssSelectorComplexity(String cssSelector, Document document) {
        // Calcola la complessità del selettore CSS in base alla sua struttura
        Elements elements = document.select(cssSelector);

        // Esempio di valutazione: consideriamo la lunghezza del selettore e il numero di ID e classi
        //int lengthScore = cssSelector.length();
        int classCount = countSelectorSpecificity(cssSelector, "\\.");
        int attributeCount = countSelectorSpecificity(cssSelector, "\\[");
        int idCount = countSelectorSpecificity(cssSelector, "\\#");
        int childCount=countSelectorSpecificity(cssSelector,"child\\(\\d+| >");
        int functionCount=countSelectorSpecificity(cssSelector,":|::");
        int nodeCount = elements.size();

        System.out.println("CSS: attributeCount: "+attributeCount+" node count: "+nodeCount+" classCount: "+classCount+
                " idCount: "+idCount+"childCount: "+childCount+" functionCOunt: "+functionCount+"\n");

        // Assegna un punteggio in base alla lunghezza e alla specificità del selettore
        float complexityScore = (classCount*1.4f)+(attributeCount*1.4f)+(idCount*0.3f)+(childCount*1.4f)+(nodeCount*0.7f)+(functionCount*1.2f);

        return complexityScore;
    }



    private static float countXPathSelectorComplexity(String xpathSelector, Document document) {
        // Calcola la complessità del selettore XPath in base alla sua struttura

        // Esempio di valutazione: consideriamo la lunghezza del selettore e il numero di attributi e nodi
        //int lengthScore = xpathSelector.length();
        int classCount = countSelectorSpecificity(xpathSelector, "\\[@class");
        int attributeCount = countSelectorSpecificity(xpathSelector, "\\[@");
        int idCount = countSelectorSpecificity(xpathSelector, "\\[@id");
        int childCount=countSelectorSpecificity(xpathSelector,"\\[\\d+");
        int nodeCount = countSelectorSpecificity(xpathSelector, "\\/");
        int functionCount=countSelectorSpecificity(xpathSelector,"\\(\\)");

        System.out.println("XPATH: attributeCount: "+attributeCount+" node count: "+nodeCount+" classCount: "+classCount+
                " idCount: "+idCount+"childCount: "+childCount+" functionCOunt: "+functionCount+"\n");

        // Assegna un punteggio in base alla lunghezza, al numero di attributi e al numero di nodi del selettore
        float complexityScore = (classCount*1.4f)+(attributeCount*1.4f)+(idCount*0.3f)+(childCount*1.4f)+(nodeCount*0.7f)+(functionCount*1.2f);

        return complexityScore;
    }

    public static int countSelectorSpecificity(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return (int) matcher.results().count();
    }

    // Metodo per normalizzare il punteggio del selettore nell'intervallo 1-10
    private static int normalizeScore(int selectorScore) {
        // Normalizza il punteggio nell'intervallo 1-10
        int maxSelectorScore = 100; // Valore massimo ottenibile per il punteggio del selettore (valore massimo attuale dei punteggi)
        int minSelectorScore = 0;   // Valore minimo ottenibile per il punteggio del selettore (valore minimo attuale dei punteggi)
        int normalizedMax = 10;     // Valore massimo normalizzato
        int normalizedMin = 1;      // Valore minimo normalizzato

        // Utilizza la formula di normalizzazione min-max
        int normalizedScore = normalizedMin + (selectorScore - minSelectorScore) * (normalizedMax - normalizedMin) / (maxSelectorScore - minSelectorScore);

        //Pochi casi in cui il selettore è fuori scala
        if(normalizedScore>10)normalizedScore=10;
        return normalizedScore;
    }


    // Test della funzione
    /*
    public static void main(String[] args) {

        String cssSelector = ".example"; // Selettore CSS di esempio
        int cssSelectorComplexity = evaluateCssSelectorComplexity(cssSelector);
        System.out.println("CSS Selector Complexity: " + cssSelectorComplexity);

        String xpathSelector = "//*[@class='example']"; // Selettore XPath di esempio
        int xpathSelectorComplexity = evaluateXPathSelectorComplexity(xpathSelector);
        System.out.println("XPath Selector Complexity: " + xpathSelectorComplexity);
    }

     */
}
