package com.example.Project.controller;

import com.example.Project.model.Project;
import com.example.Project.model.EntityDefinition;
import com.example.Project.model.AttributeDefinition;
import com.example.Project.repository.ProjectRepository;
import com.example.Project.repository.EntityRepository;
import com.example.Project.repository.AttributeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProjectController {

    private final ProjectRepository projectRepo;
    private final EntityRepository entityRepo;
    private final AttributeRepository attributeRepo;

    public ProjectController(ProjectRepository projectRepo, EntityRepository entityRepo, AttributeRepository attributeRepo) {
        this.projectRepo = projectRepo;
        this.entityRepo = entityRepo;
        this.attributeRepo = attributeRepo;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("projects", projectRepo.findAll());
        model.addAttribute("entities", entityRepo.findAll());
        model.addAttribute("project", new Project());
        model.addAttribute("entity", new EntityDefinition());
        model.addAttribute("attribute", new AttributeDefinition());
        return "create-project";
    }

    @PostMapping("/projects")
    public String saveProject(@ModelAttribute Project project) {
        projectRepo.save(project);
        return "redirect:/";
    }

    @PostMapping("/entities")
    public String saveEntity(@ModelAttribute EntityDefinition entity) {
        entityRepo.save(entity);
        return "redirect:/";
    }

    @PostMapping("/attributes")
    public String saveAttribute(@ModelAttribute AttributeDefinition attribute) {
        attributeRepo.save(attribute);
        return "redirect:/";
    }
}
