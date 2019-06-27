package be.businesstraining.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Greetings {

    @Value("Hello From the Bean (JavaConfig)")
    private String message;

    public Greetings() {
    }

    public Greetings(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
