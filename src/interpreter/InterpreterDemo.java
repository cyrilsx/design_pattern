package interpreter;

public class InterpreterDemo {

    public static void main(String[] args) {

        Expression expression = new OrExpression(new TerminalExpression("Lions"),
                new AndExpression(new TerminalExpression("Birds"), new TerminalExpression("Cats")));

        final boolean resultLions = expression.solve("Lions");
        System.out.println("Result for Lions: " +resultLions);
        final boolean resultDogs = expression.solve("Dogs");
        System.out.println("Result for Dogs: " +resultDogs);

    }

}
