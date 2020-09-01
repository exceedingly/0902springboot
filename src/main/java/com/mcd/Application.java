package com.mcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mcd.mapper")
@ComponentScan("com.mcd.controller")
@ComponentScan("com.mcd.mapper")
//@MapperScan("com/mcd/mapper/*")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
