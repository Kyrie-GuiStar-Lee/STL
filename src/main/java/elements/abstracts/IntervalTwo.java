package elements.abstracts;

public abstract class IntervalTwo extends ExpressionTwo{

    double start;
    double end;

    public IntervalTwo(Expression left, Expression right, double start, double end) {
        super(left, right);
        this.start = start;
        this.end = end;
    }

}
