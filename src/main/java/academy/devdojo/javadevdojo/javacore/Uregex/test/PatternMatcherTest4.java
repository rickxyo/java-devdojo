package academy.devdojo.javadevdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest4 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que NÃO for digito
        // \s = espaços em branco
        // \S = todos os caracteres excluindo os brancos
        // \w = a-zA-Z, digitos, _
        // \W = tudo que NÃO for incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n, m} de n até m
        // ()
        // $
        String regex = "0[xX]([0-9a-fA-F])+\\s";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
