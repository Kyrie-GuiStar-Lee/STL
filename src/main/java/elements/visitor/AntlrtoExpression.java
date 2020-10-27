package elements.visitor;

import elements.abstracts.Expression;
import elements.element.ParenExpression;
import elements.abstracts.Predicates;
import elements.abstracts.ExpressionOne;
import elements.element.expressionone.Eventually;
import elements.element.expressionone.Global;
import elements.element.expressionone.NotExpression;
import elements.element.expressiontwo.And;
import elements.element.expressiontwo.Imply;
import elements.element.expressiontwo.Or;
import elements.element.expressiontwo.Until;
import elements.element.predicates_Type.GEPredicate;
import elements.element.predicates_Type.GTPredicate;
import elements.element.predicates_Type.LEPredicate;
import elements.element.predicates_Type.LTPredicate;
import gen.STLBaseVisitor;
import gen.STLParser;

import java.util.*;

public class AntlrtoExpression extends STLBaseVisitor<Expression> {

    private List<String> semanticErrors;//左区间大于右区间；


    private Set<String> signalName;//存储信号名以和perturbation做对比

    public AntlrtoExpression(List<String> semanticErrors) {
        signalName = new HashSet<String>();
        this.semanticErrors = semanticErrors;
    }

    public Set<String> getSignalName() {
        return signalName;
    }

    @Override
    public Expression visitParens_(STLParser.Parens_Context ctx) {
        Expression expr = visit(ctx.getChild(1));
        return new ParenExpression(expr);
    }

    @Override
    public Expression visitEventually_(STLParser.Eventually_Context ctx) {

        double start = Double.parseDouble(ctx.getChild(2).getText());
        double end = Double.parseDouble(ctx.getChild(4).getText());
        if(start>end)
        {
            semanticErrors.add("Error: interval error");
        }
        Expression expr = visit(ctx.getChild(6));
        return new Eventually(expr,start,end);
    }

    @Override
    public Expression visitGlobal_(STLParser.Global_Context ctx) {

        double start = Double.parseDouble(ctx.getChild(2).getText());
        double end = Double.parseDouble(ctx.getChild(4).getText());
        if(start>end)
        {
            semanticErrors.add("Error: interval error");
        }
        Expression expr = visit(ctx.expr());
        return new Global(expr,start,end);
    }

    @Override
    public Expression visitNot_(STLParser.Not_Context ctx) {
        Expression expr = visit(ctx.getChild(0));
        return new NotExpression(expr);
    }

    @Override
    public Expression visitAnd_(STLParser.And_Context ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new And(left,right);
    }

    @Override
    public Expression visitOr_(STLParser.Or_Context ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Or(left,right);
    }

    @Override
    public Expression visitImply_(STLParser.Imply_Context ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Imply(left,right);
    }

    @Override
    public Expression visitUntil_(STLParser.Until_Context ctx) {
        Expression left = visit(ctx.getChild(0));
        double start = Double.parseDouble(ctx.getChild(3).getText());
        double end = Double.parseDouble(ctx.getChild(5).getText());
        Expression right = visit(ctx.getChild(7));

        return new Until(left,right,start,end);
    }

    @Override
    public Expression visitGT_(STLParser.GT_Context ctx) {
        String name = ctx.getChild(0).getText();
        signalName.add(name);
        double value = Double.parseDouble(ctx.getChild(2).getText());
        return new GTPredicate(name,value);
    }

    @Override
    public Expression visitLT_(STLParser.LT_Context ctx) {
        String name = ctx.getChild(0).getText();
        signalName.add(name);
        double value = Double.parseDouble(ctx.getChild(2).getText());
        return new LTPredicate(name,value);
    }

    @Override
    public Expression visitGE_(STLParser.GE_Context ctx) {
        String name = ctx.getChild(0).getText();
        signalName.add(name);
        double value = Double.parseDouble(ctx.getChild(2).getText());
        return new GEPredicate(name,value);
    }

    @Override
    public Expression visitLE_(STLParser.LE_Context ctx) {
        String name = ctx.getChild(0).getText();
        signalName.add(name);
        double value = Double.parseDouble(ctx.getChild(2).getText());
        return new LEPredicate(name,value);
    }
}
