package academy.devdojo.javadevdojo.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest1 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        // VERIFICA QUAIS ARQUIVOS TERMINAM EM BKP
        matches(path1, "glob:*.bkp"); //false
        matches(path1, "glob:**.bkp"); //true

        // VERIFICA QUAIS ARQUIVOS TERMINAM COM ESTAS 3 PALAVRAS
        matches(path1, "glob:**/*.{bkp,txt,java}"); //true
        matches(path2, "glob:**/*.{bkp,txt,java}"); //true
        matches(path3, "glob:**/*.{bkp,txt,java}"); //true

        // VERIFICA QUAIS ARQUIVOS TERMINAM COM ESTAS 3 LETRAS
        matches(path1, "glob:**/*.???"); //true
        matches(path2, "glob:**/*.???"); //true
        matches(path3, "glob:**/*.???"); //false
    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
