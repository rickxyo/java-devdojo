package academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salarys;
    private double media = 0;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salarys == null){
            return;
        }
        for (double salary : salarys) {
            System.out.println(salary + " ");
        }

        media();
    }

    public void media() {
        if (salarys == null) {
            return;
        }

        for (double salary : salarys) {
            media += salary;
        }
        media /= salarys.length;

        System.out.println("\nMedia salarial " + media);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalarys() {
        return salarys;
    }

    public double getMedia() {
        return media;
    }
}
