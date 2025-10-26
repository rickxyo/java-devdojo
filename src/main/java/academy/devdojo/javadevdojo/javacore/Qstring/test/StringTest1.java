package academy.devdojo.javadevdojo.javacore.Qstring.test;

public class StringTest1 {
    public static void main(String[] args) {
        // strings são IMUTÁVEIS
        String nome = "Pedro"; // String constant pool
        String nome2 = "Pedro";
        nome = nome.concat(" Henrique"); // nome += " Henrique"
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Pedro"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string

        System.out.println(nome2 == nome3); // false
        System.out.println(nome2 == nome3.intern()); // true
    }
}
