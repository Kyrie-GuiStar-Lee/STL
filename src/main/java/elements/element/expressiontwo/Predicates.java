package elements.element.expressiontwo;
import elements.abstracts.Expression;
import elements.abstracts.ExpressionTwo;
import elements.element.RealNum;

public class Predicates extends ExpressionTwo {
    public String sigName;
    public String type;
    /**
     * 2020-10-18
     * tong
     * 将数字类作为成员
     */
    public RealNum num;
    public Predicates(Expression left,Expression right){
        super(left,right);
    }
}
