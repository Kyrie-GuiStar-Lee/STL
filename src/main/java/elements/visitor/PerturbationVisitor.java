package elements.visitor;

import elements.abstracts.Expression;
import elements.element.Perturbation;
import gen.STLBaseVisitor;
import gen.STLParser;

public class PerturbationVisitor extends STLBaseVisitor<Perturbation> {
    @Override
    public Perturbation visitPerturbation_(STLParser.Perturbation_Context ctx) {
        String name = ctx.getChild(0).getText();
        double num = Double.parseDouble(ctx.getChild(2).getText());
        return new Perturbation(name,num);
    }
}
