package elements.abstracts;
import elements.abstracts.Expression;

public abstract class Predicates extends Expression{
    public String sigName;
    /**
     * 2020-10-18
     * tong
     * 将数字类作为成员
     */
    public double num;

    public Predicates(String sigName, double num) {
        this.sigName = sigName;
        this.num = num;
    }
}
