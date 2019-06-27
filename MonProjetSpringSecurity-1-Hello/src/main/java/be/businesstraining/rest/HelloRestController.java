package be.businesstraining.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public  String sayHell() {
        return "Hello Hello, how do you do ?";
    }
}
