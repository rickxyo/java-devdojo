package academy.devdojo.javadevdojo.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    //para trabalhar com interfaces se utiliza "implements" e não "extends" como vimos em herancas
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
