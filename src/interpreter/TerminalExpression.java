package interpreter;

public class TerminalExpression implements Expression {

    private final String word;

    public TerminalExpression(String word) {
        this.word = word;
    }

    @Override
    public boolean solve(String expression) {
        return word.equals(expression);
    }
}
