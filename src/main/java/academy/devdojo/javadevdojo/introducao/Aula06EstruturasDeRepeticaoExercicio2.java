package academy.devdojo.javadevdojo.introducao;

public class Aula06EstruturasDeRepeticaoExercicio2 {
    public static void main(String[] args) {
        double totalValue = 50000;
        double valorParcela = 1;

        for (int i = 1; i < totalValue; i++) {
            valorParcela = totalValue / i;
           if (valorParcela < 1000) {
               break;
           }
            System.out.println("Parcela "+ i+ " R$ "+valorParcela);
           }
        }
    }

