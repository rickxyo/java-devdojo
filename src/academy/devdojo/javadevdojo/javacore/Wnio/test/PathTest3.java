package academy.devdojo.javadevdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest3 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/pedro");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);
    }
}
