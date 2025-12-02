package com.example.Project.repository;

import com.example.Project.model.EntityDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<EntityDefinition, Long> {
}
