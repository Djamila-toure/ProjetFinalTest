package com.example.Project.controller;

import com.example.Project.exporter.Exporter;
import com.example.Project.model.Dataset;
import com.example.Project.model.Project;
import com.example.Project.service.DatasetGeneratorService;
import com.example.Project.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/export")
@RequiredArgsConstructor
public class ExportController {

    private final DatasetGeneratorService datasetGeneratorService;
    private final ProjectService projectService;
    private final Exporter jsonExporter;

    @GetMapping
    public byte[] export(@RequestParam Long projectId, @RequestParam(defaultValue = "10") int count) throws Exception {
        Project project = projectService.getById(projectId);
        Dataset dataset = datasetGeneratorService.generate(project, count);
        return jsonExporter.export(dataset);
    }
}
