package visitor.java8;

import java.math.BigDecimal;

public interface TaxableElement {

    BigDecimal accept(VisiteurTax visiteurTax);
}
