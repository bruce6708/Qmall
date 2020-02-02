package com.qm.mall.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/index")
    public String hello(){
        return  "hello mall";
    }
}
