package visitor;

public class PrintVisitor implements Visitor {

    @Override public void visit(Car car) {
        System.out.println("Visit car");
    }

    @Override public void visit(Wheel wheel) {
        System.out.println("Visit wheel");
    }

    @Override public void visit(Engine engine) {
        System.out.println("Visit engine");

    }
}
