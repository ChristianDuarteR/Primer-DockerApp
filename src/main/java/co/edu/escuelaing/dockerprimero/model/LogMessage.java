package co.edu.escuelaing.dockerprimero.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.Random;

@Setter
@Getter
@Document(collection = "logMessage")
public class LogMessage {

    @Id
    private String id;

    private String message;

    private Date timestamp;

    public LogMessage(String message) {
        this.id = String.valueOf( new Random().nextInt());
        this.message = message;
        this.timestamp = new Date();
    }

}
