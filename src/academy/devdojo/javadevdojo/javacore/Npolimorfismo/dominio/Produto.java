package academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio;

//polimorfismo = trocar o TIPO da variavel de referencia mas ainda continuar utilizando outros objetos (ProdutoTest2)

public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
