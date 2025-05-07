package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // (-(ponto de inserção) −1)
        // index 0,1,2,3
        // value 0,2,3,4

        // binarySearch SO FUNCIONA COM A LISTA ESTANDO ORDENADA
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 2)); // = 1
    }
}
