package visitor;

public class Wheel implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
