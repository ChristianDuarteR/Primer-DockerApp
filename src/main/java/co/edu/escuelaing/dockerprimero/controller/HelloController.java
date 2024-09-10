package co.edu.escuelaing.dockerprimero.controller;


import co.edu.escuelaing.dockerprimero.model.LogMessage;
import co.edu.escuelaing.dockerprimero.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/logservice")
public class HelloController {

    @Autowired
    LogService logService;

    @PostMapping
    public ResponseEntity<List<LogMessage>> addMessageAndGetLatest(@RequestBody String message) {
        LogMessage logMessage = new LogMessage(message);
        logService.save(logMessage);
        List<LogMessage> latestMessages = logService.findTop10ByOrderByDateCreatedDesc();

        return ResponseEntity.ok(latestMessages);
    }
}