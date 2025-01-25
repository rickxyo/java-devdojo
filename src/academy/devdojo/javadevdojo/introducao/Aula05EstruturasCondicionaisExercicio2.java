package academy.devdojo.javadevdojo.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisExercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weekDay;

        System.out.println("Enter the week day");
        weekDay = scanner.nextInt();

        switch (weekDay){
            case 1:
                System.out.println("Domingo - Não é dia util");
                break;
            case 2:
                System.out.println("Segunda - Dia util");
                break;
            case 3:
                System.out.println("Terça - Dia util");
                break;
            case 4:
                System.out.println("Quarta - Dia util");
                break;
            case 5:
                System.out.println("Quinta - Dia util");
                break;
            case 6:
                System.out.println("Sexta - Dia util");
                break;
            case 7:
                System.out.println("Sabado - Não é dia util");
                break;
            default:
                System.out.println("opcao invalida");
        }
    }
}
