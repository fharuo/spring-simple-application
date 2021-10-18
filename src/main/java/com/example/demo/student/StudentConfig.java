package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student fabricio = new Student(
                    "Fabrício Takaki",
                    "fabriciohtakaki@gmail.com",
                    LocalDate.of(1995, FEBRUARY, 17)

            );
            Student giovanni = new Student(
                    "Giovanni Maciel",
                    "giovannicmaciel@gmail.com",
                    LocalDate.of(1995, MARCH, 02)

            );
            Student diogo = new Student(
                    "Diogo Marcone",
                    "diogomilgral@gmail.com",
                    LocalDate.of(1996, APRIL, 29)

            );

            repository.saveAll(List.of(fabricio, giovanni, diogo));
        };
    }
}
