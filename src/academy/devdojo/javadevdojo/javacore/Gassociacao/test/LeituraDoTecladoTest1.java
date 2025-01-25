package academy.devdojo.javadevdojo.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String name = input.nextLine();
        System.out.println(name);
        System.out.println("Digite sua idade");
        int age = input.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char genre = input.next().charAt(0);
        System.out.println("------------------------");
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Genre " + genre);
    }
}
