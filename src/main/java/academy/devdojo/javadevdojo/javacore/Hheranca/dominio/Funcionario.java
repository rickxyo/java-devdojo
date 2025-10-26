package academy.devdojo.javadevdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco inicializacao estatico de funcionario");
    }
    {
        System.out.println("Dentro do bloco inicializacao de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco inicializacao de funcionario 2");
    }

    public Funcionario(String name){
        super(name);
    }

    public void imprime() {
        super.imprime();
        //System.out.println(this.salario);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.name + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
