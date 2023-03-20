package visitor.java8;

import java.math.BigDecimal;

public class FrenchTaxVisiteur implements VisiteurTax {
    @Override
    public BigDecimal visit(Car car) {
        return car.price().multiply(BigDecimal.valueOf(0.5));
    }

    @Override
    public BigDecimal visit(Alcoohol alcoohol) {
        return alcoohol.price().multiply(BigDecimal.valueOf(0.6));
    }

    @Override
    public BigDecimal visit(Book book) {
        return book.price().multiply(BigDecimal.valueOf(0.2));
    }
}
