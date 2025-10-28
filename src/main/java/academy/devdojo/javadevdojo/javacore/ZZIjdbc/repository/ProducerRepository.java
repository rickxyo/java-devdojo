package academy.devdojo.javadevdojo.javacore.ZZIjdbc.repository;

import academy.devdojo.javadevdojo.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javadevdojo.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection coonn = ConnectionFactory.getConnection();
             Statement smt = coonn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Inserted producer in the Database, rows affected '{}'", rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
