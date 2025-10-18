package academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.test;

import academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.dominio.AircraftSingletonLazy;

public class AircraftSingletonLazyTest1 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
