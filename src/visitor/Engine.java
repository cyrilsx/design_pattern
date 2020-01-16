package visitor;

public class Engine implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
