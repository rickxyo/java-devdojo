package academy.devdojo.javadevdojo.javacore.Fmodifificadorestatico.test;

import academy.devdojo.javadevdojo.javacore.Fmodifificadorestatico.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
