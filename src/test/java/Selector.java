import org.jsoup.nodes.Document;

public class Selector {

    private String selector;
    private String type;
    private float selectorScore;

    @Override
    public String toString() {
        return
                "selector='" + selector + '\'' +
                ", type='" + type + '\'' +
                ", selectorScore=" + selectorScore;
    }

    public Selector(String element, String type) {
        this.selector = element;
        this.type=type;
        this.selectorScore =0;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
