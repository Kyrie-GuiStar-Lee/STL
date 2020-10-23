package elements.element.expressionone;


import elements.abstracts.UnaryOperator;

public class TemporalOperator extends UnaryOperator {
    String temporalOp;
    double left;
    double right;

    public TemporalOperator(String temporalOp, double left, double right) {
        this.temporalOp = temporalOp;
        this.left = left;
        this.right = right;
    }
}
