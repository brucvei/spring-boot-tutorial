package com.example.bruna.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

  CommandLineRunner commandLineRunner(StudentRepository repository){
     return args -> {
       Student bruna = new Student("Bruna", "bruna@email.com", LocalDate.of(2004, Month.JANUARY, 12));
       Student ana = new Student("Ana", "ana@email.com", LocalDate.of(2003, Month.FEBRUARY, 13));

       repository.saveAll(List.of(bruna, ana));
     };
  }
}
