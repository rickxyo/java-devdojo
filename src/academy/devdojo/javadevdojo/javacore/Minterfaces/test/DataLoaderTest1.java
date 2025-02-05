package academy.devdojo.javadevdojo.javacore.Minterfaces.test;

import academy.devdojo.javadevdojo.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.javadevdojo.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest1 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
