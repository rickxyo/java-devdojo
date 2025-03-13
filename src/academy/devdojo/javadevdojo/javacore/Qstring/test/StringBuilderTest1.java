package academy.devdojo.javadevdojo.javacore.Qstring.test;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        //nome = nome.concat(" DevDojo"); maneira correta
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);


    }
}
