package abstracts;
// 二元运算符 抽象类
public abstract class ExpressionTwo extends Expression{
    Expression left;
    Expression right;
    ExpressionTwo(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }
}
