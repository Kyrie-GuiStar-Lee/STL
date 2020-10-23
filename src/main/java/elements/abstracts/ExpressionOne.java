package elements.abstracts;

public abstract class ExpressionOne extends Expression{
    Expression expression;

    public ExpressionOne(Expression expression) {
        this.expression = expression;
    }
}
