package academy.devdojo.javadevdojo.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
