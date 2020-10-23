package elements.visitor;

import elements.abstracts.Expression;
import elements.element.Formula;
import gen.STLBaseVisitor;
import gen.STLParser;

public class FormulaVisitor extends STLBaseVisitor<Formula> {

    @Override
    public Formula visitFormula_(STLParser.Formula_Context ctx) {
        String name = ctx.getChild(0).getText();
        AntlrtoExpression exprVisitor = new AntlrtoExpression();
        Expression expr = exprVisitor.visit(ctx.getChild(2));
        return new Formula(name,expr);
    }
}
