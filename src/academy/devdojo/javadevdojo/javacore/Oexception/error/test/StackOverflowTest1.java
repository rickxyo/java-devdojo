package academy.devdojo.javadevdojo.javacore.Oexception.error.test;

public class StackOverflowTest1 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
