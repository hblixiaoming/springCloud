package com.lxm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${spring.datasource}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
}
