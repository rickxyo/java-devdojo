package academy.devdojo.javadevdojo.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for

        int count = 0;
        while (count <= 10){
            System.out.println(count);
            count++;
        }

        int count1 = 0;
        do {
            System.out.println("Dentro do do-while");
            count1++;
        } while (count1 < 10);

        for (int i = 0; i < 10; i++){
            System.out.println("For "+i);
        }

    }
}
