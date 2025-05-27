package academy.devdojo.javadevdojo.javacore.Zgenerics.test;

import academy.devdojo.javadevdojo.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest1 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(barcoList);
//        criarArrayComUmObjeto(new Barco("Canoa"));
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }

//    private static <T> void criarArrayComUmObjeto(T t){
//        List<T> list = List.of(t);
//        System.out.println(list);
//    }


}
