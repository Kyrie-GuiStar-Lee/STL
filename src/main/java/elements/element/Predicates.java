package elements.element;
import elements.abstracts.Expression;

public class Predicates extends Expression{
    public String sigName;
    public String type;
    /**
     * 2020-10-18
     * tong
     * 将数字类作为成员
     */
    public double num;

    public Predicates(String sigName, String type, double num) {
        this.sigName = sigName;
        this.type = type;
        this.num = num;
    }
}
