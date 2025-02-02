package academy.devdojo.javadevdojo.javacore.Jmodificadorfinal.test;

import academy.devdojo.javadevdojo.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.javadevdojo.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("F40");
        ferrari.imprime();


    }
}
