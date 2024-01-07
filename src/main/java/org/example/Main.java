package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {


        ApplicationContext ap = new AnnotationConfigApplicationContext(Console.class);
      Employee ee =(Employee) ap.getBean("e12");
          System.out.println(ee.getName()+" "+ee.getAge());
        System.out.printf("Hello and welcome!");


    }
}