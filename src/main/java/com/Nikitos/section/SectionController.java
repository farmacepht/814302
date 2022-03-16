package com.Nikitos.section;


import com.Nikitos.warehous.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SectionController {
    @Autowired
    SectionRepository sectionRepository;

    @GetMapping("/sections")
    public List<Section> getAll() {
        return sectionRepository.findAll();
    }

    @PostMapping("/sections")
    public Section addSection(@RequestBody Section sect) {
        return sectionRepository.save(sect);
    }
}
