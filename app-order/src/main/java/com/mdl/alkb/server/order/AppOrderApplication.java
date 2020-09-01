package com.mdl.alkb.server.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//代表自己是一个服务提供方
public class AppOrderApplication {

  public static void main(String[] args) {
    System.setProperty("spring.config.location", "classpath:/application_order.yml");
    SpringApplication.run(AppOrderApplication.class, args);
  }

}
