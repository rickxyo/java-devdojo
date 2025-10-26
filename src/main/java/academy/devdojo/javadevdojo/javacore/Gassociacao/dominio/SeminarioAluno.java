package academy.devdojo.javadevdojo.javacore.Gassociacao.dominio;

public class SeminarioAluno {
    private String name;
    private int age;
    private Seminario seminario;

    public SeminarioAluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
