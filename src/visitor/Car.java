package visitor;

import java.util.List;

public class Car implements Element {

    private final List<Wheel> wheels;
    private final Engine engine;

    public Car(List<Wheel> wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    @Override
    public void accept(Visitor visitor) {
        wheels.forEach(visitor::visit);
        visitor.visit(this.engine);
        visitor.visit(this);
    }
}
