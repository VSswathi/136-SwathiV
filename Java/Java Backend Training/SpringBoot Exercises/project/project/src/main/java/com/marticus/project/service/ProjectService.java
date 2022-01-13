package com.marticus.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.project.Repo.ProjectRepo;
import com.marticus.project.entity.ProjectEntity;

@Service
public class ProjectService {

	@Autowired
	ProjectRepo projectRepo;
	
	
	public void saveProject(ProjectEntity projectEntity) {
		// TODO Auto-generated method stub
		projectRepo.save(projectEntity);
	}
		
	
	public ProjectEntity findProjectById(int id)
	{
		return projectRepo.findProjectById(id);
		
	}


	public ProjectEntity findTechnologyByName(String name) {
		// TODO Auto-generated method stub
		return projectRepo.findProjectByName(name);
	}
}
