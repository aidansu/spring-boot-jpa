package com.aidansu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {

    public static void main( String[] args ) {
        System.out.println( "Hello World JPA !" );
        // 启动 Spring Boot
        SpringApplication.run(App.class, args);
    }
}