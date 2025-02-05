package academy.devdojo.javadevdojo.javacore.Minterfaces.dominio;

public interface DataLoader {
    //metodos dentro de interface nao precisam de "public" ou "abstract" pois já vem como padrão, colocando apenas para aprender
    public abstract void load();
    public default void checkPermission(){
        System.out.println("Fazendo chegagem de permissões");
    }
}
