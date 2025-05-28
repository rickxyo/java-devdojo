package academy.devdojo.javadevdojo.javacore.ZZAclassesinternas.test;

public class OuterClassesTest2 {
    private String name = "Midoriya";

    void print() {
        final String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + "" + lastName);
            }
        }
//        LocalClass localClass = new LocalClass();
//        localClass.printLocal();
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest2 outer = new OuterClassesTest2();
        outer.print();
    }
}
