package com.aereo.aereo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = "com.aereo.aereo.*")
public class AereoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AereoApplication.class, args);
    }
}
