package visitor.java8;

import java.math.BigDecimal;

public class VisiteurTaxDemo {
    public static void main(String[] args) {

        VisiteurTax taxVisiteur = new FrenchTaxVisiteur();
        System.out.println(taxVisiteur.visit(new Alcoohol(BigDecimal.TEN)));
        System.out.println(taxVisiteur.visit(new Car(BigDecimal.TEN)));
        System.out.println(taxVisiteur.visit(new Book(BigDecimal.TEN)));

    }
}
