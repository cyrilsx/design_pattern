package strategy;

import java.time.YearMonth;

public class StrategyDemo {

    public static void main(String[] args) {
        final CreditCard creditCard1 = new CreditCard(new NonNullValidatorStrategy(),
                null, "254", YearMonth.now());

        System.out.println("Credit1 using NonNullValidator is valid " + creditCard1.isValid());

        final CreditCard creditCard2 = new CreditCard(new NonNullValidatorStrategy(),
                "4584515454", "254", YearMonth.now().minusMonths(2));

        final CreditCard creditCard2bis = new CreditCard(new SmarterValidatorStrategy(),
                "4584515454", "254", YearMonth.now().minusMonths(2));

        System.out.println("Credit2 using NonNullValidator is valid " + creditCard2.isValid());
        System.out.println("Credit2 using SmarterValidatorStrategy is valid " + creditCard2bis.isValid());


    }

}
