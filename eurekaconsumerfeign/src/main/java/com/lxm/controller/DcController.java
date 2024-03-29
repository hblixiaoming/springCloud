package com.lxm.controller;

import com.lxm.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
    @Autowired
    private ConsumerService consumerService;
    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consume();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
