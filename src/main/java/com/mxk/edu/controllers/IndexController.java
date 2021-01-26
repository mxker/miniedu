package com.mxk.edu.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author mxker
 * @Date 2021/1/26 下午1:39
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/hello")
    public void index(){
        System.out.println("hello edu");
    }

}
