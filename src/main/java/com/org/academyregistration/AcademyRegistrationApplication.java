package com.org.academyregistration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Slf4j
public class AcademyRegistrationApplication {

    public static void main(String[] args) {
        log.info("started  AcademyRegistrationApplication");
        SpringApplication.run(AcademyRegistrationApplication.class, args);
    }
}
