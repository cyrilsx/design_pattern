package strategy;

import java.time.YearMonth;

public class CreditCard {

    private final ValidationStrategy validationStrategy;

    private final String creditCardNumber;
    private final String cvv;
    private final YearMonth expirationDate;

    public CreditCard(ValidationStrategy validationStrategy, String creditCardNumber, String cvv, YearMonth expirationDate) {
        this.validationStrategy = validationStrategy;
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    public boolean isValid() {
        return validationStrategy.validate(this);
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public YearMonth getExpirationDate() {
        return expirationDate;
    }
}
