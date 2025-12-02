package com.example.Project.service;


import com.example.Project.model.AttributeDefinition;
import com.example.Project.repository.AttributeDefinitionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttributeDefinitionService {

    private final AttributeDefinitionRepository repository;

    public List<AttributeDefinition> getAll() {
        return repository.findAll();
    }

    public AttributeDefinition getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public AttributeDefinition save(AttributeDefinition attributeDefinition) {
        return repository.save(attributeDefinition);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
