package academy.devdojo.javadevdojo.introducao;
import java.util.Scanner;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.println("what is you age: ");
        age = scanner.nextInt();

        System.out.println("your age is " + age);

    }
}
