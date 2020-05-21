package org.hnitacm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: HnitFleaMarket
 * @description:
 * @author: Leo
 * @date: 2020-05-22 02:36
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
