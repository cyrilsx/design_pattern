package visitor.java20;


public class VisiteurTaxDemo {

    public static void main(String[] args) {
        System.out.println("Tax for book " + calculateTax(new Book(10.0)));
        System.out.println("Tax for car " + calculateTax(new Car(100000.0)));
    }

    private static double calculateTax(VisiteurTax visiteurTax) {
        return switch (visiteurTax) {
            case Car car -> car.calculate();
            case Book book -> book.calculate();
            default -> throw new IllegalArgumentException("Manage case " + visiteurTax);
        };
    }

    private static double calculateTaxWithSeal(VisiteurTax visiteurTax) {
        return switch (visiteurTax) {
            case Car car -> car.calculate();
            case Book book when book.price > 100 -> book.calculate();
            case Book book -> book.calculate();
        };
    }


    sealed interface VisiteurTax permits Car, Book {
        double calculate();
    }

    record Car(double price) implements VisiteurTax {
        @Override
        public double calculate() {
            return price * 0.2;
        }
    }

    record Book(double price) implements VisiteurTax {
        @Override
        public double calculate() {
            return price * 0.1;
        }
    }

}
