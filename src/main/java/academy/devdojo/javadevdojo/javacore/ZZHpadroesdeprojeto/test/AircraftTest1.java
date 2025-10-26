package academy.devdojo.javadevdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javadevdojo.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;

public class AircraftTest1 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
