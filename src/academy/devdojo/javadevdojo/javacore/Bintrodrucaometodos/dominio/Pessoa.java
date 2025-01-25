package academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.dominio;

public class Pessoa {
    private String name;
    private int age;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Idade Invalida");
            return;
        }
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
