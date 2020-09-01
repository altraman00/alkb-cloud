package com.mdl.alkb.fn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleAlkbFnApplication {

  public static void main(String[] args) {
    System.setProperty("spring.config.location","classpath:/configs.properties");
    SpringApplication.run(ModuleAlkbFnApplication.class, args);
  }

}
