package academy.devdojo.javadevdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest3 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que NÃO for digito
        // \s = espaços em branco
        // \S = todos os caracteres excluindo os brancos
        // \w = a-zA-Z, digitos, _
        // \W = tudo que NÃO for incluso no \w
        // []
        String regex = "[abcABC]";
        //String texto = "abaaba";
        String texto2 = "cafeBABE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
