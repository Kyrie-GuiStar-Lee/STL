package elements.element;

import elements.abstracts.Expression;

public class ParenExpression extends Expression {
    Expression expr;

    public ParenExpression(Expression expr) {
        this.expr = expr;
    }
}
