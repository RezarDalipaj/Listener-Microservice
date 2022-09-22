package com.example.listener.service.impl;

import com.example.listener.model.UserDto;
import com.example.listener.service.ListenerService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Getter
@Setter
public class ListenerServiceImpl implements ListenerService {
    private String message;
    @RabbitListener(queues = "${rabbitmq.user.queue}")
    public void getMessageFromMicroservice(UserDto message){
        String payload = message.getUserName();
        String logMessage = "Saved user: " + payload;
        log.info(logMessage);
        this.setMessage(payload);
    }
}

