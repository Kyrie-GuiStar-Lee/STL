package elements.element;

public class Perturbation {
    public String sigName;
    public RealNum num;//可以是整数也可以是小数

    public Perturbation(String sigName, RealNum num) {
        this.sigName = sigName;
        this.num = num;
    }
}
