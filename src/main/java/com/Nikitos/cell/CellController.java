package com.Nikitos.cell;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CellController {
    @Autowired
    CellRepository cellRepository;

    @GetMapping("/cells")
    public List<Cell> getAll() {
        return cellRepository.findAll();
    }
}
