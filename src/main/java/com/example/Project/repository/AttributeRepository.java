package com.example.Project.repository;

import com.example.Project.model.AttributeDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttributeRepository extends JpaRepository<AttributeDefinition, Long> {
}
