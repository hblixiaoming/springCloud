package com.lxm.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @Autowired private DcService dcService;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consume() {
        return dcService.consumer();
    }

    public String fallback() {
        return "fallback";
    }
}
