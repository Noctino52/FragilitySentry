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
    public static int evaluateCssSelectorComplexity(String cssSelector) {
        // Valuta la complessità del selettore CSS in base alla sua struttura e alla complessità della pagina
        int selectorScore = countCssSelectorComplexity(cssSelector);

        // Normalizza il punteggio del selettore nell'intervallo 1-10 in base al punteggio complessivo della pagina
        int normalizedScore = normalizeScore(selectorScore);

        return normalizedScore;
    }

    // Metodo per valutare la complessità di un selettore XPath
    public static int evaluateXPathSelectorComplexity(String xpathSelector) {
        // Valuta la complessità del selettore XPath in base alla sua struttura e alla complessità della pagina
        int selectorScore = countXPathSelectorComplexity(xpathSelector);

        // Normalizza il punteggio del selettore nell'intervallo 1-10 in base al punteggio complessivo della pagina
        int normalizedScore = normalizeScore(selectorScore);

        return normalizedScore;
    }

    private static int countCssSelectorComplexity(String cssSelector) {
        // Calcola la complessità del selettore CSS in base alla sua struttura

        // Esempio di valutazione: consideriamo la lunghezza del selettore e il numero di ID e classi
        int lengthScore = cssSelector.length();
        int idCount = countSelectorSpecificity(cssSelector, "#");
        int classCount = countSelectorSpecificity(cssSelector, ".");

        // Assegna un punteggio in base alla lunghezza e alla specificità del selettore
        int complexityScore = lengthScore*4 + idCount * 4 + classCount*2;

        return complexityScore;
    }



    private static int countXPathSelectorComplexity(String xpathSelector) {
        // Calcola la complessità del selettore XPath in base alla sua struttura

        // Esempio di valutazione: consideriamo la lunghezza del selettore e il numero di attributi e nodi
        int lengthScore = xpathSelector.length();
        int attributeCount = countSelectorSpecificity(xpathSelector, "@");;
        int nodeCount = countSelectorSpecificity(xpathSelector, "/");

        System.out.println("XPATH:  Lenght: "+lengthScore+" attributeCount: "+attributeCount+" node count: "+nodeCount+"\n");

        // Assegna un punteggio in base alla lunghezza, al numero di attributi e al numero di nodi del selettore
        int complexityScore = lengthScore + attributeCount * 4 + nodeCount*2;

        return complexityScore;
    }

    private static int countSelectorSpecificity(String cssSelector, String prefix) {
        // Conta il numero di ID o classi presenti nel selettore CSS
        int count = 0;
        int startIndex = 0;
        while (startIndex != -1) {
            startIndex = cssSelector.indexOf(prefix, startIndex);
            if (startIndex != -1) {
                count++;
                startIndex += prefix.length();
            }
        }
        return count;
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
