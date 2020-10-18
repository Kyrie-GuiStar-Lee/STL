package elements.element;
import elements.abstracts.Expression;
import elements.abstracts.ExpressionTwo;

public class Predicates extends ExpressionTwo {
    public String sigName;
    public String type;
    public Double num;
    public Predicates(Expression left,Expression right){
        super(left,right);
    }
}
