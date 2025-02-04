package academy.devdojo.javadevdojo.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String name;
    protected double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

