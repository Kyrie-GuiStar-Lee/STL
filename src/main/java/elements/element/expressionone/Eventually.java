package elements.element.expressionone;
import elements.abstracts.Expression;
import elements.abstracts.ExpressionOne;
import elements.element.Interval;

public class Eventually extends ExpressionOne {
    Interval interval;

    public Eventually(Expression expression, Interval interval) {
        super(expression);
        this.interval = interval;
    }
}
