package com.example.demo;

import com.example.demo.ejemploIoc.ServicioX;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("prueba");
        SpringApplication.run(DemoApplication.class, args);
    }


}
