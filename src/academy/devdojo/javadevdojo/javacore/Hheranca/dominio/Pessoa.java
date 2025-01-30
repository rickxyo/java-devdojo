package academy.devdojo.javadevdojo.javacore.Hheranca.dominio;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco inicializacao estatico de pessoa");
    }
    {
        System.out.println("Dentro do bloco inicializacao de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco inicializacao de pessoa 2");
    }

    public Pessoa(String name){
        System.out.println("Dentro do construtor de pessoa");
        this.name = name;
    }

//    public Pessoa(String name, String cpf){
//        this(name);
//        this.cpf = cpf;
//    }

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
