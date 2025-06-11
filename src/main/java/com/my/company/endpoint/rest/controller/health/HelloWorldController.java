package com.my.company.endpoint.rest.controller.health;

import com.my.company.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "... world!";
    }
}