package com.Nikitos.positions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PositionController {
    @Autowired
    PositionRepository positionRepository;

    @GetMapping("/positions")
    public List<Position> getAll() {
        return positionRepository.findAll();
    }
}
