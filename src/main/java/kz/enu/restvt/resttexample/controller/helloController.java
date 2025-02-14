package kz.enu.restvt.resttexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class helloController { // ✅ Название класса с заглавной буквы (Java Code Style)
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
