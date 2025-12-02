package com.example.Project.repository;

import com.example.Project.model.EntityDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityDefinitionRepository extends JpaRepository<EntityDefinition, Long> {
}
