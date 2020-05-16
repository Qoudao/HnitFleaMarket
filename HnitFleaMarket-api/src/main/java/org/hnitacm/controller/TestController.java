package org.hnitacm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: HnitFleaMarket
 * @description:
 * @author: Leo
 * @date: 2020-05-16 16:48
 **/
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
