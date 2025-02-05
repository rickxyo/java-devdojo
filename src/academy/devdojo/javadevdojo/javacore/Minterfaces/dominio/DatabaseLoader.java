package academy.devdojo.javadevdojo.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader{
    //para trabalhar com interfaces se utiliza "implements" e não "extends" como vimos em herancas
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
