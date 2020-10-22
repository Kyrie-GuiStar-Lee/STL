package elements.element.expressionone;
import elements.abstracts.Expression;
import elements.abstracts.ExpressionOne;
import elements.element.Interval;

public class Global extends ExpressionOne {
    Interval interval;

    public Global(Expression expression, Interval interval) {
        super(expression);
        this.interval = interval;
    }

}
