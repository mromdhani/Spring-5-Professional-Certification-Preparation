package be.businesstraining.domain;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class Average implements IRating{

    @Override
    public int getRating() {
        return 3;
    }
}