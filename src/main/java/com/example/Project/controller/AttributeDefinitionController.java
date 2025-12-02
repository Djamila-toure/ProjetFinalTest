package com.example.Project.controller;

import com.example.Project.model.AttributeDefinition;
import com.example.Project.service.AttributeDefinitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attributes")
@RequiredArgsConstructor
public class AttributeDefinitionController {

    private final AttributeDefinitionService service;

    @GetMapping
    public List<AttributeDefinition> getAll() {
        return service.getAll();
    }

    @PostMapping
    public AttributeDefinition create(@RequestBody AttributeDefinition attribute) {
        return service.save(attribute);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
