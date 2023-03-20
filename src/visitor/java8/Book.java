package visitor.java8;

import java.math.BigDecimal;

public record Book(BigDecimal price) implements TaxableElement {
    @Override
    public BigDecimal accept(VisiteurTax visiteurTax) {
//        return price.multiply(BigDecimal.valueOf(0.1));
        return visiteurTax.visit(this);
    }
}
