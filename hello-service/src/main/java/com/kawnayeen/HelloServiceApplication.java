package com.kawnayeen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by kawnayeen on 2/16/17.
 */
@EnableEurekaClient
@SpringBootApplication
public class HelloServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(HelloServiceApplication.class,args);
    }
}
