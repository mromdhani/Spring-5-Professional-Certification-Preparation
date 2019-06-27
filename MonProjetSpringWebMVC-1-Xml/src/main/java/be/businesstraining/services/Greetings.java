package be.businesstraining.services;

public class Greetings {

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
