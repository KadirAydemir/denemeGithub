package com.example.TestParserExecutor.services;

import com.example.TestParserExecutor.models.User;


public interface HelloService {
    String getMessage(String name);

    void sayHi(User user);
}
