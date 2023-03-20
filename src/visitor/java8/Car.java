package visitor.java8;

import java.math.BigDecimal;

public record Car(BigDecimal price) implements TaxableElement {
    @Override
    public BigDecimal accept(VisiteurTax visiteurTax) {
//        return price.multiply(BigDecimal.valueOf(0.2));
        return visiteurTax.visit(this);
    }
}
