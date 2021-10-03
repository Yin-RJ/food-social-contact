package com.yinrj.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinrongjie
 * @version 1.0
 * @date 2021/10/3
 * @description 测试controller
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/test")
    public String hello(@RequestParam String name) {
        return "hello, " + name;
    }
}
