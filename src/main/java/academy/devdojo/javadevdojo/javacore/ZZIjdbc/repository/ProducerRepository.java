package academy.devdojo.javadevdojo.javacore.ZZIjdbc.repository;

import academy.devdojo.javadevdojo.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javadevdojo.javacore.ZZIjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection coonn = ConnectionFactory.getConnection();
             Statement smt = coonn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
