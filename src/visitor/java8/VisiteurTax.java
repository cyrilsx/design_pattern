package visitor.java8;

import java.math.BigDecimal;

public interface VisiteurTax {

    BigDecimal visit(Car car);
    BigDecimal visit(Alcoohol alcoohol);
    BigDecimal visit(Book book);


}
