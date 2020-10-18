package elements.element;

import static java.lang.Double.MAX_VALUE;

public class Interval{
    public RealNum lNum;
    public RealNum rNum;
    public Interval(RealNum l,RealNum r)
    {
        this.lNum=l;
        this.rNum=r;
    }

    /**
     * 判断区间是否合理
     * @return
     */
    public boolean judge(Interval a)
    {
        if(a.rNum.getNum() == MAX_VALUE || a.lNum.getNum() == MAX_VALUE)
            return false;
        else if(a.lNum.getNum()>a.rNum.getNum())
            return false;
        return true;
    }
}
