package academy.devdojo.javadevdojo.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculaBonus() {
        this.salary = this.salary + this.salary * 0.2;

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
