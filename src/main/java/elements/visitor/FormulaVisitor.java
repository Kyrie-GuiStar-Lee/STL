package elements.visitor;

import elements.abstracts.Expression;
import elements.element.Formula;
import gen.STLBaseVisitor;
import gen.STLParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FormulaVisitor extends STLBaseVisitor<Formula> {
    private Set<String> signalName;
    private List<String> semanticErrors;

    @Override
    public Formula visitFormula_(STLParser.Formula_Context ctx) {

        String formulaName = ctx.getChild(0).getText();
        AntlrtoExpression exprVisitor = new AntlrtoExpression(semanticErrors);
        signalName = exprVisitor.getSignalName();
        Expression expr = exprVisitor.visit(ctx.expr());
        return new Formula(formulaName,expr);
    }

    public Set<String> getSignalName() {
        return signalName;
    }
}
