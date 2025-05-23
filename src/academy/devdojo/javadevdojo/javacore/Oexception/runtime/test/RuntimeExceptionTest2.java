package academy.devdojo.javadevdojo.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest2 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}
