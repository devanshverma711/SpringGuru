package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Console {

    @Bean(name="e12")
    public Employee getEmp(){
        Employee e1 = new Employee();
    e1.setName("Devansh");
        return e1;
    }
    @Bean
    public Age getage(){
        return new Age(23);
    }



}
