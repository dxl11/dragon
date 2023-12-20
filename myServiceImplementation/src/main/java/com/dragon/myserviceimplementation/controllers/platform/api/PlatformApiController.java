package com.dragon.myserviceimplementation.controllers.platform.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description:
* @Param:
* @return:
* @Author: lydms
* @Date: 2023/12/18
*/
@Slf4j
@RestController
@RequestMapping(PlatformApiController.BASE_URL)
@RequiredArgsConstructor
public class PlatformApiController {
    public static final String BASE_URL = "";

    @GetMapping("/hello-world")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld() {
        return "Hello world";
    }
}
