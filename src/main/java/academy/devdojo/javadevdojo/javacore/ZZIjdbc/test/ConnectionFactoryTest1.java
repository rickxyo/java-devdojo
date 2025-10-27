package academy.devdojo.javadevdojo.javacore.ZZIjdbc.test;

import academy.devdojo.javadevdojo.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javadevdojo.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.javadevdojo.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest1 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("NHK").build();
        ProducerRepository.save(producer);
    }
}
