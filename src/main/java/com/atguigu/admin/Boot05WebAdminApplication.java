package com.atguigu.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.atguigu.admin")//指定原生servlet都放在哪里，默认是当前包和子包
@SpringBootApplication
public class Boot05WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot05WebAdminApplication.class, args);
        System.out.println("hello,git!");
        System.out.println("Sss");
        System.out.println("hahahaaha");
        System.out.println("hello ,hot-fix");
        System.out.println("hello ,master test");
        System.out.println("hello ,hot-fix test2");
    }

}
