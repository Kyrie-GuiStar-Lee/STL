package elements.element.expressionone;


import elements.abstracts.UnaryOperator;
import elements.element.RealNum;

public class TemporalOperator extends UnaryOperator {
    String temporalOp;
    RealNum left;
    RealNum right;

    public TemporalOperator(String temporalOp, RealNum left, RealNum right) {
        this.temporalOp = temporalOp;
        this.left = left;
        this.right = right;
    }
}
