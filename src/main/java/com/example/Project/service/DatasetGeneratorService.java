package com.example.Project.service;

import com.example.Project.model.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DatasetGeneratorService {

    public Dataset generate(Project project, int count) {
        List<Map<String, Object>> rows = new ArrayList<>();

        if(project.getEntities() != null) {
            for(int i = 0; i < count; i++) {
                Map<String, Object> row = new HashMap<>();
                for(EntityDefinition entity : project.getEntities()) {
                    if(entity.getAttributes() != null) {
                        for(AttributeDefinition attr : entity.getAttributes()) {
                            row.put(attr.getName(), generateRandomValue(attr.getType()));
                        }
                    }
                }
                rows.add(row);
            }
        }

        return new Dataset(project, rows);
    }

    private Object generateRandomValue(AttributeType type) {
        Random random = new Random();
        switch(type) {
            case STRING: return "Str" + random.nextInt(100);
            case INTEGER: return random.nextInt(100);
            case FLOAT: return random.nextFloat() * 100;
            case BOOLEAN: return random.nextBoolean();
            case DATE: return new Date();
            default: return null;
        }
    }
}
