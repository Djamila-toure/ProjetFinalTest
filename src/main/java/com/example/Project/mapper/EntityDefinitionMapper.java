package com.example.Project.mapper;

import com.example.Project.dto.EntityDefinitionDTO;
import com.example.Project.model.EntityDefinition;
import com.example.Project.model.Project;

public class EntityDefinitionMapper {

    public static EntityDefinitionDTO toDTO(EntityDefinition entity) {
        EntityDefinitionDTO dto = new EntityDefinitionDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        if(entity.getProject() != null) dto.setProjectId(entity.getProject().getId());
        return dto;
    }

    public static EntityDefinition toEntity(EntityDefinitionDTO dto, Project project) {
        EntityDefinition entity = new EntityDefinition();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setProject(project);
        return entity;
    }
}
