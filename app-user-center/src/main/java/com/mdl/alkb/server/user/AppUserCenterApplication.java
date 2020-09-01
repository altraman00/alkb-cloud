package com.mdl.alkb.server.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppUserCenterApplication {

  public static void main(String[] args) {
    System.setProperty("spring.config.location","classpath:/configs.properties");
    SpringApplication.run(AppUserCenterApplication.class, args);
  }


}
