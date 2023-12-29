package com.dragon.safetyverification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description: 测试
* @Param:
* @return:
* @Author: lydms
* @Date: 2023/12/26
*/
@RestController
@RequestMapping("/ss")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
