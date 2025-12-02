package com.example.Project.mapper;

import com.example.Project.dto.AttributeDefinitionDTO;
import com.example.Project.model.AttributeDefinition;
import com.example.Project.model.EntityDefinition;

public class AttributeDefinitionMapper {

    public static AttributeDefinitionDTO toDTO(AttributeDefinition attr) {
        AttributeDefinitionDTO dto = new AttributeDefinitionDTO();
        dto.setId(attr.getId());
        dto.setName(attr.getName());
        dto.setType(attr.getType());
        if(attr.getEntity() != null) dto.setEntityId(attr.getEntity().getId());
        return dto;
    }

    public static AttributeDefinition toEntity(AttributeDefinitionDTO dto, EntityDefinition entity) {
        AttributeDefinition attr = new AttributeDefinition();
        attr.setId(dto.getId());
        attr.setName(dto.getName());
        attr.setType(dto.getType());
        attr.setEntity(entity);
        return attr;
    }
}
