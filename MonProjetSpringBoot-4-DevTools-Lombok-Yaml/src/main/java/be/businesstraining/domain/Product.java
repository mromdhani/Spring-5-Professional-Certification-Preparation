package be.businesstraining.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class Product {

    @Value("${product.id}")
    private String id;

    @Value("${product.name}")
    private String name;


}
