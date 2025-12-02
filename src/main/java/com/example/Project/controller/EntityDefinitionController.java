package com.example.Project.controller;



import com.example.Project.model.EntityDefinition;
import com.example.Project.service.EntityDefinitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entities")
@RequiredArgsConstructor
public class EntityDefinitionController {

    private final EntityDefinitionService service;

    @GetMapping
    public List<EntityDefinition> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public EntityDefinition getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public EntityDefinition save(@RequestBody EntityDefinition entityDefinition) {
        return service.save(entityDefinition);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
