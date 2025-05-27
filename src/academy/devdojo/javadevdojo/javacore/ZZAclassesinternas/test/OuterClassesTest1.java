package academy.devdojo.javadevdojo.javacore.ZZAclassesinternas.test;

public class OuterClassesTest1 {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAttributes(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest1 outerClass = new OuterClassesTest1();

        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest1().new Inner();

        inner.printOuterClassAttributes();
        inner2.printOuterClassAttributes();
    }
}
