package co.edu.escuelaing.dockerprimero.service;

import co.edu.escuelaing.dockerprimero.model.LogMessage;
import co.edu.escuelaing.dockerprimero.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    @Autowired
    LogRepository logRepository;

    public void save(LogMessage logMessage){
        logRepository.save(logMessage);
    }

    public List<LogMessage> findTop10ByOrderByDateCreatedDesc () {
       return logRepository.findTop10ByOrderByDateCreatedDesc();
    }
}
