package interpreter;

public class AndExpression implements Expression {

    private final Expression expression1;
    private final Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean solve(String expression) {
        return expression1.solve(expression) && expression2.solve(expression);
    }
}
