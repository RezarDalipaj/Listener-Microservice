package com.example.listener.controller;

import com.example.listener.model.QueueMessageDto;
import com.example.listener.service.impl.ListenerServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@AllArgsConstructor
@Service
@Slf4j
public class ListenerController {
    private final ListenerServiceImpl listenerService;
    @GetMapping("/message")
    public ResponseEntity<QueueMessageDto> getMessageFromMicroservice(){
        QueueMessageDto queueMessageDto = new QueueMessageDto();
        queueMessageDto.setMessageFromOtherMicroservice(listenerService.getMessage());
        return ResponseEntity.ok(queueMessageDto);
    }
}
