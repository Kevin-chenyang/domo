package com.line.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program demo
 * @description:
 * @author: chenyang
 * @create: 2019/09/16 17:22
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello kevin";
    }
}
