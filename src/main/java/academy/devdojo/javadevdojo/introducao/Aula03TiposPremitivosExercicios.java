package academy.devdojo.javadevdojo.introducao;

import java.util.Scanner;

public class Aula03TiposPremitivosExercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName, userAddress, paymentDate;
        double userSalary;

        System.out.println("Enter your name: ");
        userName = scanner.nextLine();

        System.out.println("Enter your address: ");
        userAddress = scanner.nextLine();

        System.out.println("Enter your salary");
        userSalary = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter the date: ");
        paymentDate = scanner.nextLine();

        System.out.println("Eu " + userName + " morando no endereco " + userAddress + " confirmo que recebi o salario de " + userSalary + ", na data " + paymentDate);



    }
}
