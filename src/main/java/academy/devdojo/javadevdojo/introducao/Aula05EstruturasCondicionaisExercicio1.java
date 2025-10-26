package academy.devdojo.javadevdojo.introducao;

public class Aula05EstruturasCondicionaisExercicio1 {
    public static void main(String[] args) {

        double salario = 10000;

        if (salario >= 5000){
            System.out.println("5%");
        } else if (salario >= 10000) {
            System.out.println("10%");
        } else{
            System.out.println("15%");
        }
    }
}
