package elements.abstracts;

public abstract class IntervalOne extends ExpressionOne{
    double start;
    double end;

    public IntervalOne(Expression expression, double start, double end) {
        super(expression);
        this.start = start;
        this.end = end;
    }

//    public RealNum lNum;
//    public RealNum rNum;
//    public Interval(RealNum l,RealNum r)
//    {
//        this.lNum=l;
//        this.rNum=r;
//    }
//
//    /**
//     * 判断区间是否合理
//     * @return
//     */
//    public boolean judge(Interval a)
//    {
//        if(a.rNum.getNum() == MAX_VALUE || a.lNum.getNum() == MAX_VALUE)
//            return false;
//        else if(a.lNum.getNum()>a.rNum.getNum())
//            return false;
//        return true;
//    }
}
