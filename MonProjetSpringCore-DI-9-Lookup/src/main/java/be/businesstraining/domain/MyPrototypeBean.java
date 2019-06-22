package be.businesstraining.domain;

import java.time.LocalDateTime;

public class MyPrototypeBean {

    private String dateTimeString = LocalDateTime.now().toString();

    public String getDateTime() {
        return dateTimeString;
    }
}