package strategy;

import java.time.YearMonth;
import java.util.Objects;

public class SmarterValidatorStrategy implements ValidationStrategy {

    @Override
    public boolean validate(CreditCard creditCard) {
        return Objects.nonNull(creditCard.getCreditCardNumber())
                && Objects.nonNull(creditCard.getCvv())
                && Objects.nonNull(creditCard.getExpirationDate())
                && creditCard.getExpirationDate().isAfter(YearMonth.now());
    }
}
