package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void guardarUsuario() {
        Usuario daniel = new Usuario("Daniel");
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("/usuario", daniel, String.class);
        Assertions.assertEquals("Usuario guardado", responseEntity.getBody());
    }

    @Test
    void consultarUsuario() {

        ResponseEntity<List> forEntity = restTemplate.getForEntity("/usuarios", List.class);
        List body = forEntity.getBody();
        //Assertions.assertEquals("Daniel",  body.get(0));
        //Flyway o Liquibase (Para pruebas de integration)
        //Versionar todos sus scripts de base de datos.
    }
}