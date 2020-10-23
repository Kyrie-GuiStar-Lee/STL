package elements.element.expressionone;
import elements.abstracts.Expression;
import elements.abstracts.UnaryOperator;
import elements.element.Interval;
import elements.element.expressionone.TemporalOperator;

public class ExpressionOne extends Expression{
    UnaryOperator op;
    Expression expression;

    public ExpressionOne(UnaryOperator op, Expression expression) {
        this.op = op;
        this.expression = expression;
    }
}
