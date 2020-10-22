package elements.element;

import java.util.List;

public class Program {
    Formula formula; //公式
    List<Perturbation> perts;//扰动链表

    public Program(Formula formula, List<Perturbation> perts) {
        this.formula = formula;
        this.perts = perts;
    }
}
