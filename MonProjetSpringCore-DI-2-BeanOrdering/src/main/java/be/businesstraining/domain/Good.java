package be.businesstraining.domain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Good implements IRating {

    @Override
    public int getRating() {
        return 2;
    }
}