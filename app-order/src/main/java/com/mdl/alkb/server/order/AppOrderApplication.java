package com.mdl.alkb.server.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppOrderApplication {

  public static void main(String[] args) {
    System.setProperty("spring.config.location", "classpath:/configs_order.properties");
    SpringApplication.run(AppOrderApplication.class, args);
  }

}
