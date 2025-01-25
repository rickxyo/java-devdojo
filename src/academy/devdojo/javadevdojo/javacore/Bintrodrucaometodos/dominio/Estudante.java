package academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.dominio;

public class Estudante {
    public String name;
    public int age;
    public char genre;

    public void imprime(){
        System.out.println("-----------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.genre);
    }
}
