package elements.element;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class RealNum {
    /**
     * 2020-10-18
     * tong
     */
  private double num;

    public double getNegNum() {
        /**
         * 不是负数返回最小值
         */
        if(num<0)
        return num;
        return MIN_VALUE;
    }
    public double getNum() {
        /**
         * 不是正数返回最大值
         */
        if(num>=0)
            return num;
        return MAX_VALUE;
    }
    public void setNum(double num) {
        this.num = num;
    }
}
