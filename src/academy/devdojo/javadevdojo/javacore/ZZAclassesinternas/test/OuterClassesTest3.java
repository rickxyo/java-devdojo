package academy.devdojo.javadevdojo.javacore.ZZAclassesinternas.test;

public class OuterClassesTest3 {
    private String name = "teste 01";

    static class Nested {
        private String lastNmae = "teste 02";

        void print() {
            System.out.println(new OuterClassesTest3().name + " " + lastNmae);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
