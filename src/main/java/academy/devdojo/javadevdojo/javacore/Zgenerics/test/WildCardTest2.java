package academy.devdojo.javadevdojo.javacore.Zgenerics.test;


import java.util.List;

public class WildCardTest2 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
    }

    // AQUI VOCE ESTÁ FALANDO QUE PODE RECEBER QUALQUER UM QUE SEJA "Animal" OU QUALQUER FILHO
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    // AQUI VOCE ESTÁ FALANDO QUE PODE RECEBER QUALQUER UM QUE SEJA "Animal" OU QUALQUER PAI
    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
