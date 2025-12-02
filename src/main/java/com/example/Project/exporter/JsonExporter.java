package com.example.Project.exporter;

import com.example.Project.model.Dataset;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class JsonExporter implements Exporter {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte[] export(Dataset dataset) throws Exception {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsBytes(dataset);
    }
}
