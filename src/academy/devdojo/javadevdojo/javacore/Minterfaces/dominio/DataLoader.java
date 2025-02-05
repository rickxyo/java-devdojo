package academy.devdojo.javadevdojo.javacore.Minterfaces.dominio;

//interface seria basicamente um "contrato" onde todos os metodos por padrao serao PUBLICOS e ABSTRATOS, se voce nao criar ele abstrato precisa criar como DEFAULT
//voce nao pode criar OBJETOS com interfaces
//metodos dentro de interface nao precisam de "public" ou "abstract", pois já vem como padrão, colocando apenas para aprender
//por padrao todos os atributos em uma interface ja sao constantes, linha 9

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}
