package com.example.TestParserExecutor.controllers;

import com.example.TestParserExecutor.models.mappers.UserMapper;
import com.example.TestParserExecutor.models.requests.TestRequest;
import com.example.TestParserExecutor.models.requests.UserPostRequest;
import com.example.TestParserExecutor.services.HelloService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class HelloController {
    @Autowired
    HelloService helloService;

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        return helloService.getMessage(name);
    }

    @RequestMapping(value = "ahelloa", method = RequestMethod.POST)
    public void sayHi(@RequestBody UserPostRequest userPostRequest) {
        var user = userMapper.from(userPostRequest);
        helloService.sayHi(user);
    }

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public void sayHi(@RequestBody TestRequest testRequest) {
    }
}
