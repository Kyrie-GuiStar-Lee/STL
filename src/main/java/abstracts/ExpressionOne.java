package abstracts;
// 一元运算符 抽象类
public abstract class ExpressionOne extends Expression{
    Expression expression;
    ExpressionOne(Expression expression){
        this.expression = expression;
    }
}
