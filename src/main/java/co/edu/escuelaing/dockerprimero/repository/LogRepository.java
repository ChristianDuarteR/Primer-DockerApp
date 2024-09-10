package co.edu.escuelaing.dockerprimero.repository;

import co.edu.escuelaing.dockerprimero.model.LogMessage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends MongoRepository<LogMessage, String> {
    List<LogMessage> findTop10ByOrderByDateCreatedDesc();

}
