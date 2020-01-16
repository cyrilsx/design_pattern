package visitor;

import java.util.Arrays;

public class VisitorDemo {

    public static void main(String[] args) {
        final Car car = new Car(Arrays.asList(
                new Wheel(), new Wheel(), new Wheel(), new Wheel()),
                new Engine()
        );

        car.accept(new PrintVisitor());
    }

}
