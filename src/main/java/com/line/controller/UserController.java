package com.line.controller;

import com.line.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @program demo
 * @description:
 * @author: chenyang
 * @create: 2019/09/20 00:05
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public List<User> list(){

        return new ArrayList<>() ;
    }
}
