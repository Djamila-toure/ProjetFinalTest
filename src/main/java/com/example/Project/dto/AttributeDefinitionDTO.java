package com.example.Project.dto;

import com.example.Project.model.AttributeType;
import lombok.Data;

@Data
public class AttributeDefinitionDTO {
    private Long id;
    private String name;
    private AttributeType type;
    private Long entityId;
}
