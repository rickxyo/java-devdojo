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
            log.info("Inserted producer '{}' in the Database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection coonn = ConnectionFactory.getConnection();
             Statement smt = coonn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the Database, rows affected '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

}
