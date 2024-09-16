package com.theelitelions.budgetbuddy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    @RequestMapping("/")
    String displayDefaultMessage(){
        return "Hello Spring Boot!, please..";
    }
}
