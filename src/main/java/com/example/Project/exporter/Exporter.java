package com.example.Project.exporter;

import com.example.Project.model.Dataset;

public interface Exporter {
    byte[] export(Dataset dataset) throws Exception;
}
