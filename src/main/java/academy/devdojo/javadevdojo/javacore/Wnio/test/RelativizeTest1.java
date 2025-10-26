package academy.devdojo.javadevdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest1 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/pedro");
        Path clazz = Paths.get("/home/pedro/devdojofoda/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);
    }
}
