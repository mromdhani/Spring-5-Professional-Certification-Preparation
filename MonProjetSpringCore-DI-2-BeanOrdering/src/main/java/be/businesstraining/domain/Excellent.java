package be.businesstraining.domain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Excellent implements IRating {

    @Override
    public int getRating() {
        return 1;
    }
}