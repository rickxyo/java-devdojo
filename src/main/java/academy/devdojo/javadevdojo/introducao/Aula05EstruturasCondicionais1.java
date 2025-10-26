package academy.devdojo.javadevdojo.introducao;

public class Aula05EstruturasCondicionais1 {
    public static void main(String[] args) {

        //if

        //opcao 01
        int idade = 19;
        if (idade >= 18){
            System.out.println("Autorizado a comprar bebida alcolica");
        }

        //opcao 02
        int idade2 = 18;
        boolean autorizadoComprarBebida = idade2 >= 18;
        if (autorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcolica");
        }

        //else

        if (idade >= 18){
            System.out.println("Autorizado a comprar bebida alcolica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcolica");
        }

    }
}
