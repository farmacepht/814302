package com.Nikitos.cell_product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Cell_productController {
    @Autowired
    Cell_productRepository cellProductRepository;

    @GetMapping("/cell_product")
    public List<Cell_product> getAll() {
        return cellProductRepository.findAll();
    }
}
