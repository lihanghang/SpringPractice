package com.mason.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lihanghang
 */
@SpringBootApplication
public class PracticeApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(PracticeApplication.class, args);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}