package academy.devdojo.javadevdojo.introducao;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {

        //else if

        int idade = 17;
        if (idade < 15){
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}
