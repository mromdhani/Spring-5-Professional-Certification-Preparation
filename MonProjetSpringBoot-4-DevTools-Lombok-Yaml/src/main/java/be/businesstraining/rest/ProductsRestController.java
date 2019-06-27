package be.businesstraining.rest;

import be.businesstraining.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsRestController {

    private Product product;
    // @Autowired is not required here as of Spring 4.3
    public ProductsRestController(Product product) {
        this.product = product;
    }
    @GetMapping("/product")
    public Product getProduct() {
        return product;
    }
}
