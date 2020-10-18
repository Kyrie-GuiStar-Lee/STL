package elements.abstracts;
// 二元运算符 抽象类
public abstract class ExpressionTwo extends Expression{
    public Expression left;
    public Expression right;
    public ExpressionTwo(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }
}
