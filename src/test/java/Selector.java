public class Selector {

    private String selector;
    private float selectorScore;

    public Selector(String element) {
        this.selector = element;
        this.selectorScore = Judge.getElementScore(this);
        System.out.println("Nome Selettore: "+element+" Punteggio del selettore: "+selectorScore);
    }


    public String getSelector() {
        return selector;
    }
    public void setSelector(String selector) {
        this.selector = selector;
    }
    public float getSelectorScore() {
        return selectorScore;
    }
    public void setSelectorScore(float selectorScore) {
        this.selectorScore = selectorScore;
    }
}
