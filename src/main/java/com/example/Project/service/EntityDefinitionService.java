package com.example.Project.service;


import com.example.Project.model.EntityDefinition;
import com.example.Project.repository.EntityDefinitionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EntityDefinitionService {

    private final EntityDefinitionRepository repository;

    public List<EntityDefinition> getAll() {
        return repository.findAll();
    }

    public EntityDefinition getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public EntityDefinition save(EntityDefinition entityDefinition) {
        return repository.save(entityDefinition);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
