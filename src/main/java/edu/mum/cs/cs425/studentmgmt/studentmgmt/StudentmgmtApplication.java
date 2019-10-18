package edu.mum.cs.cs425.studentmgmt.studentmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StudentmgmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtApplication.class, args);
    }

}
