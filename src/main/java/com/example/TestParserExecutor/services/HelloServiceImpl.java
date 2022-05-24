package com.example.TestParserExecutor.services;

import com.example.TestParserExecutor.models.User;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getMessage(String name) {
        return "Hello " + name;
    }

    @Override
    public void sayHi(User user) {
        System.out.println("Hello " + user.getName());
        System.out.println("By " + user.getSurname());
    }
}
