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

    @GetMapping("/{id}")
    public AttributeDefinition getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AttributeDefinition save(@RequestBody AttributeDefinition attributeDefinition) {
        return service.save(attributeDefinition);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
