package expressions;

public class BinOp extends Expression {
    Operation op;
    Expression left;
    Expression right;

    public BinOp(Operation op, Expression left, Expression right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    @Override
    public int eval() {
        switch (op) {
            case PLUS:
                return left.eval() + right.eval();
            case MINUS:
                return left.eval() - right.eval();
            case MLT:
                return left.eval() * right.eval();
            case DIV:
                return left.eval() / right.eval();
                default: return -1;
        }
    }

    @Override
    public String toString() {
        return "(" + left.toString() +")"+ op + "(" + right.toString() +")"; }
}
