package academy.devdojo.javadevdojo.javacore.ZZGconcorrencia.test;

import academy.devdojo.javadevdojo.javacore.ZZGconcorrencia.dominio.Quote;
import academy.devdojo.javadevdojo.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;

public class CompletableFutureTest4 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesithDiscount(service);
    }

    private static void searchPricesithDiscount(StoreServiceWithDiscount service){
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync) //sotre:price:code
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
    }

}
