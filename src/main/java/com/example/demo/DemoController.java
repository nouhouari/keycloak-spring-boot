package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController{

    @GetMapping("public")
    public String public_path(){
        return "Hello public world!";
    }

    @GetMapping("private")
    public String private_path(){
        return "Hello private world!";
    }
}