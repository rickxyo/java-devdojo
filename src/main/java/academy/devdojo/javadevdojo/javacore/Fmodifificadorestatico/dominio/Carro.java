package academy.devdojo.javadevdojo.javacore.Fmodifificadorestatico.dominio;

public class Carro {
    private String name;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String name, double velocidadeMaxima) {
        this.name = name;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("-------------------");
        System.out.println("Nome " + this.name);
        System.out.println("Velocidade Maxima " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
            Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
