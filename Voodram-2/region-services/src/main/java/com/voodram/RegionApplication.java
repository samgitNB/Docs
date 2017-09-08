package com.voodram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RegionApplication {



    public static void main(String[] args) {
        SpringApplication.run(RegionApplication.class, args);
        System.out.println("\n<<<<<<<<<<< : RegionApplication Running : >>>>>>>>>>");
    }

}
