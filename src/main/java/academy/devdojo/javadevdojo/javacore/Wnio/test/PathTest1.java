package academy.devdojo.javadevdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest1 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\pedri\\intelij\\exercicios - java\\java-devdojo\\file.txt");
        System.out.println(p1.getFileName());
    }
}
