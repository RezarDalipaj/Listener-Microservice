package com.example.listener.service;

import com.example.listener.model.UserDto;

public interface ListenerService {
    void getMessageFromMicroservice(UserDto message);
}
