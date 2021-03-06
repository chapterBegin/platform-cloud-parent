package com.antivirus.applet;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDubbo
@SpringBootApplication
@EnableDiscoveryClient
public class AppletConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppletConsumerApplication.class, args);
    }

}
