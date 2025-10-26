package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest1 {
    public static void main(String[] args) {
//        List<Manga> mangas = new ArrayList<>(6);
        //PARA REMOÇÃO "LinkedList" É MELHOR, POIS ELE É UM ARRAY QUE SABE A POSICÃO ANTERIOR E POSTERIOR
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "One Piece", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 2));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        // "iterator" CHECA ANTES DE FAZER QUALQUER ALTERAÇÃO
        // AQUI BASICAMENTE ELE ESTÁ VERIFICANDO SE A QUANTIDADE É "0", SE SIM, ELE REMOVE DA LISTA
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        // FAZ A MESMA COISA PORÉM MUITO MAIS SIMPLIFICADO - PROGRAMACAO FUNCIONAL
        // BASICAMENTE ELE UTILIZA A VARIAVEL DE REFERENCIA "manga" E PERCORRE A LISTA "mangas" E EXECUTA A LOGICA DE NEGOCIO APÓS A SETA ->
        // QUE NESSE CASO VERIFICA SE A QUANTIDADE É IGUAL A "0", SE SIM, O "removeIf" REMOVE O OBJETO
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
