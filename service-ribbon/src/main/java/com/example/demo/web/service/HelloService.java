package com.example.demo.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 使用RestTemplate调用服务端时，服务名不能带有下划线
     * Error:Request URI does not contain a valid hostname
     * @param name
     * @return
     */
    public String hiService(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }
}
