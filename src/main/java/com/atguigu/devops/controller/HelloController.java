package com.atguigu.devops.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {

    @GetMapping({"/","/hello"})
    public String sayHello(){

        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return "你好：现在【"+format+"】";
    }
}
