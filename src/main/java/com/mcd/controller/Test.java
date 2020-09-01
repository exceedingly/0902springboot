package com.mcd.controller;


import com.alibaba.fastjson.JSON;
import com.mcd.pojo.Books;
import com.mcd.service.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
    public String a1(HttpServletResponse response)  {
        response.setHeader("Access-Control-Allow-Origin","*");
        List<Books> books = booksService.selAll();
        String booksJson = JSON.toJSONString(books);
        System.out.println("mcd1");
        return booksJson;
    }
}
