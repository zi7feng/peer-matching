package com.fzq.usercenter;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.fzq.usercenter.mapper")
@EnableScheduling
public class PeerMatchingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeerMatchingApplication.class, args);
    }

}
