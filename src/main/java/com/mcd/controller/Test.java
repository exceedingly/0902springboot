package com.mcd.controller;

import com.mcd.service.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

    @Autowired
    BooksServiceImpl booksService;


    @GetMapping("/mcd")

    public String a(){
        System.out.println("mcd");
        return "index";
    }
    @GetMapping("/mcd1")
    @ResponseBody
    public String a1(){
        System.out.println("mcd1");
        return booksService.selAll().toString();
    }
}
