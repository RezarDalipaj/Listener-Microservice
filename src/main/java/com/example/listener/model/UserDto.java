package com.example.listener.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable{
    private Integer id;
    private String userName;
    private String password;
    private Double balance;
}

