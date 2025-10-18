package academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.test;

import academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.dominio.Country;
import academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.dominio.Currency;
import academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest1 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
