package be.businesstraining.service;

import be.businesstraining.domain.Product;

import java.util.Set;

public interface ProductsService {

    Product addProduct(Product product);
    Set<Product> getAllProducts();
    Product getProductById(String id);
    Product updateProduct(Product product);
    boolean deleteProduct(String id);
}
