package com.ludistudy.tennispro;

import org.flywaydb.core.Flyway;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TennisProApplication {

    public static void main(String[] args) {
        SpringApplication.run(TennisProApplication.class, args);
    }

}
