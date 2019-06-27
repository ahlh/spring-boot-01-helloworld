package com.lh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @describe
 * @date 2019/6/27 8:56
 */
//@ResponseBody
//@Controller
@RestController
public class HelloQuickController {


    @RequestMapping("/hello2")
    public String hello(){
        return "Hello World quick!";
    }

}
