package elements.element;

import elements.abstracts.Expression;

public class Formula {
    String name;
    Expression expression;

    public Formula(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }
}
