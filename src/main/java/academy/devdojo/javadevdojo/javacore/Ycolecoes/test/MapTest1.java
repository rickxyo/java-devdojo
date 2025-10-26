package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
        //"LinkedHashMap" PARA MANTER A ORMDED DE INSERCAO MESMO UTILIZANDO HASH
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "voce");
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("-------------");

        for (String values : map.values()) {
            System.out.println(values);
        }

        System.out.println("-------------");

        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
