package be.businesstraining.rest;

import be.businesstraining.domain.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

//@Controller
//@ResponseBody
@RestController
public class ProductsController {


  @GetMapping(value = "/products")   //,produces = {"application/xml", "application/json"})

//@RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity <List<Product>> allProducts() {
        List<Product> products = Arrays. asList(
                        new Product(10, "AAAAAAA"),
                        new Product(20, "BBBBBB"),
                        new Product(30, "CCCCCC"));
        return new ResponseEntity<>(products, HttpStatus.NOT_FOUND) ;
    }


}
