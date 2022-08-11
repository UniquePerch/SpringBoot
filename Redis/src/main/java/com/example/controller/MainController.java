package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MainController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello world";
    }
}
