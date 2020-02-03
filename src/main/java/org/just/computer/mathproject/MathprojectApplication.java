package org.just.computer.mathproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class MathprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MathprojectApplication.class, args);
    }

}
