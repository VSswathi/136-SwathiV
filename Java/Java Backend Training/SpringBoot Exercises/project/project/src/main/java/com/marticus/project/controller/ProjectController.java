package com.marticus.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.project.entity.ProjectEntity;
import com.marticus.project.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	
	@PostMapping("/")
	public ResponseEntity<Void> saveTechnology(@RequestBody ProjectEntity projectEntity) 
	{
		projectService.saveProject(projectEntity);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<ProjectEntity>getCustomer(@PathVariable("id") int id)
	{
		ProjectEntity projectEntity= projectService.findProjectById(id);
		return ResponseEntity.ok(projectEntity);
	}
}
