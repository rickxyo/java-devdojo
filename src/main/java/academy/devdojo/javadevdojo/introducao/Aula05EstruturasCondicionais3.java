package academy.devdojo.javadevdojo.introducao;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {

        //operador ternario

        //opcao 01
        double salario = 6000;
        String mensagemDoar = "Eu vou doar";
        String mensagemNaoDoar = "Nao tenho condicoes";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

        //opcao 02
        double salario2 = 6000;
        String resultado2 = salario2 > 5000 ? "Eu vou doar" : "Nao tenho condicoes";

        System.out.println(resultado2);

    }
}
