package com.hcl.product.ctrl;

import com.hcl.product.bl.ProductServiceImpl;
import com.hcl.product.bo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productmanagement")
public class ProductController {
    @Autowired
    private ProductServiceImpl service;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

}
