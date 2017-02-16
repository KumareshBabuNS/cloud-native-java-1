package com.kawnayeen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kawnayeen on 2/16/17.
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class HelloServiceApplication {
    @RequestMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hi " + name + ":)";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication.class, args);
    }
}
