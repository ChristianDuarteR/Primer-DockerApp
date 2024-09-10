package co.edu.escuelaing.dockerprimero;

import java.util.Collections;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

@EnableMongoRepositories(basePackages = "co.edu.escuelaing.dockerprimero.repository")
public class RestServiceApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(RestServiceApplication.class);

        app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));

        app.run(args);

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 6000;
    }

}
