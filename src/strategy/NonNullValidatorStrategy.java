package strategy;

import java.util.Objects;

public class NonNullValidatorStrategy implements ValidationStrategy {

    @Override
    public boolean validate(CreditCard creditCard) {
        return Objects.nonNull(creditCard.getCreditCardNumber())
                && Objects.nonNull(creditCard.getCvv())
                && Objects.nonNull(creditCard.getExpirationDate());
    }
}
