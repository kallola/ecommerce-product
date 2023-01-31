package com.hcl.product.dao;

import com.hcl.product.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
    //Optional<Product> findById(String id);
    //List<Product> searchProduct(String partName, double min, double max, String type);
    Product save(Product product);
}
