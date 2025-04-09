package academy.devdojo.javadevdojo.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest5 {
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
        // .
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
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
