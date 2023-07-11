public class Judge {

    static float testScore=0;
    static float sumOfSelectorScore=0;

    public static float getElementScore(Selector selector) {

        float elementScore=0;
        //Calcola punteggio:
        //Il numero di caratteri dell'elemento ecquivale al punteggio più alto è meglio è
        elementScore=selector.getSelector().length();
        return elementScore;
    }

    public static float getBadElementScore(Selector lastSelector) {
        //Calcola punteggio quando il selettore è il responsabile del fallimento:
        //Togliamo 100 punti dal punto calcolato da getElementScore()!
        return lastSelector.getSelectorScore()-100;
    }

    public static float getTestScore(Test test) {
        testScore=0;
        sumOfSelectorScore=0;
        int numberOfSelector=test.getSelectors().size();
        //Calcola punteggio:
        //Il punteggio di un test è la media aritmetica dei suoi selettori
        for (Selector selector:test.getSelectors()) {
            sumOfSelectorScore+=sumOfSelectorScore+selector.getSelectorScore();
        }
        testScore=sumOfSelectorScore/numberOfSelector;
        return testScore;
    }
}
