package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest1 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

//        for (String s : fila) {
//            System.out.println(s);
//        }

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}
