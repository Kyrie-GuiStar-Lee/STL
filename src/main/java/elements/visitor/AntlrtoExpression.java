package elements.visitor;

import elements.abstracts.Expression;
import elements.abstracts.UnaryOperator;
import elements.element.Predicates;
import elements.element.expressionone.ExpressionOne;
import gen.STLBaseVisitor;
import gen.STLParser;

public class AntlrtoExpression extends STLBaseVisitor<Expression> {
    @Override
    public Expression visitEventualAlways_(STLParser.EventualAlways_Context ctx) {
        Expression op = visit(ctx.getChild(0));
        Expression expr = visit(ctx.getChild(1));
        return ExpressionOne(op,expr);
    }

    @Override
    public Expression visitParens_(STLParser.Parens_Context ctx) {
        Expression expr = visit(ctx.getChild(1));
        return new Expression(expr);
    }

    @Override
    public Expression visitNotExpr(STLParser.NotExprContext ctx) {
        String not = ctx.getChild(0).getText();
        Expression expr = visit(ctx.getChild(1));

        return new ExpressionOne(not,expr);
    }

    @Override
    public Expression visitAndOrImplyUntil_(STLParser.AndOrImplyUntil_Context ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return super.visitAndOrImplyUntil_(ctx);
    }

    @Override
    public Expression visitPredicates_(STLParser.Predicates_Context ctx) {
        String name = ctx.getChild(0).getText();
        String type = ctx.getChild(1).getText();
        double num = Double.parseDouble(ctx.getChild(3).getText());
        return new Predicates(name,type,num);
    }

    @Override
    public Expression visitMonocularTemporalop_(STLParser.MonocularTemporalop_Context ctx) {
        return super.visitMonocularTemporalop_(ctx);
    }

    @Override
    public Expression visitUntil_(STLParser.Until_Context ctx) {
        return super.visitUntil_(ctx);
    }

    @Override
    public Expression visitPerturbation_(STLParser.Perturbation_Context ctx) {
        return super.visitPerturbation_(ctx);
    }


}
