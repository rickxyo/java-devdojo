package academy.devdojo.javadevdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)){
            fw.write("O DEVDOJO É O MELHOR CURSO DO BRASIL");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
