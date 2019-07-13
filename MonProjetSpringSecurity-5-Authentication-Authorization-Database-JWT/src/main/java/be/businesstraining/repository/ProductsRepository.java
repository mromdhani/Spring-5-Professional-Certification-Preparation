package be.businesstraining.repository;

import be.businesstraining.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductsRepository
        extends JpaRepository<Product,String> {

}
