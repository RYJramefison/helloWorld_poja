package com.my.company.endpoint.rest.controller.health;

import com.my.company.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.company.service.HelloWorldService;

//@PojaGenerated
@RestController
@AllArgsConstructor
public class HelloWorldController {
    private final HelloWorldService service;

//    public static final ResponseEntity<String> OK = new ResponseEntity<>("OK", HttpStatus.OK);
//    public static final ResponseEntity<String> KO =
//            new ResponseEntity<>("KO", HttpStatus.INTERNAL_SERVER_ERROR);

    @GetMapping("/hello")
    public String helloWorld(@RequestParam String name) {
        return service.uploadHelloWorldMessage(name);
    }
}