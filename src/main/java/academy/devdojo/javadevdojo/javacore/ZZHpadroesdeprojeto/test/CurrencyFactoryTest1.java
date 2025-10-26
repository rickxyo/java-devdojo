package academy.devdojo.javadevdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javadevdojo.javacore.ZZHpadroesdeprojeto.dominio.Country;
import academy.devdojo.javadevdojo.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import academy.devdojo.javadevdojo.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest1 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
