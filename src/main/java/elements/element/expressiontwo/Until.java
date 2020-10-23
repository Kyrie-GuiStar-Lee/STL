package elements.element.expressiontwo;

import elements.abstracts.Expression;
import elements.abstracts.ExpressionTwo;
import elements.abstracts.IntervalTwo;
import org.antlr.v4.runtime.misc.Interval;

public class Until extends IntervalTwo {
    public Until(Expression left, Expression right, double start, double end) {
        super(left, right, start, end);
    }
}
