package com.findmyteacher.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FindMyTeacherApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FindMyTeacherApiApplication.class, args);
    }

}
