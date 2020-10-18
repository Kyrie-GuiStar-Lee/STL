package elements.abstracts;
// 一元运算符 抽象类
public abstract class ExpressionOne extends Expression{
    public Expression expression;
    public ExpressionOne(Expression expression){
        this.expression = expression;
    }
}
