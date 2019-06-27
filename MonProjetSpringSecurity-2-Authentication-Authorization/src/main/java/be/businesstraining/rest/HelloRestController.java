package be.businesstraining.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/public")
    public String messagePublic() {
        return "Ceci est un message public ...";
    }
    @GetMapping("/secret")
    public String messageSecret() {
        return "Ceci est un secret, gardes le  ...";
    }
}
