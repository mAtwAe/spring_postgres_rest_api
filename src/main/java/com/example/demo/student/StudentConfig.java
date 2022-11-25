package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ridhuan = new Student(
                    "Ridhuan",
                    "mohdridhuan95@gmail.com",
                    LocalDate.of(1995, Month.JULY, 16)
            );
            Student ali = new Student(
                    "Ali",
                    "ali95@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 15)
            );

            repository.saveAll(
                List.of(ridhuan, ali)
            );
        };
    }
}
