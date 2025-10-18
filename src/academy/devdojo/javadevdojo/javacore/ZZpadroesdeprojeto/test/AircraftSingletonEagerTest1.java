package academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.test;

import academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.dominio.Aircraft;
import academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest1 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AircraftSingletonEager aircraft = AircraftSingletonEager.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
