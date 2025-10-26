package academy.devdojo.javadevdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javadevdojo.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest1 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Pedro")
                .lastName("Oldoni")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);

    }
}
