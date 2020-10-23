package elements.element;

import elements.abstracts.Expression;

public class Perturbation {
    public String sigName;
    public double num;//可以是整数也可以是小数

    public Perturbation(String sigName, double num) {
        this.sigName = sigName;
        this.num = num;
    }
}
