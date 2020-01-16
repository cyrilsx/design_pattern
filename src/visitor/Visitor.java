package visitor;

public interface Visitor {

    void visit(Car car);
    void visit(Wheel wheel);
    void visit(Engine engine);


}
