package com.voodram.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.voodram")
public class BungalowApplication {


    public static void main(String[] args) {
        SpringApplication.run(BungalowApplication.class, args);
        System.out.println("\n<<<<<<<<<<< : BungalowApplication Running : >>>>>>>>>>");
    }

}
