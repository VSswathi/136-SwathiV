package com.marticus.project.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.project.entity.ProjectEntity;

@Repository
public interface ProjectRepo extends JpaRepository<ProjectEntity, Integer> {

	ProjectEntity findProjectById(int id);

	ProjectEntity findProjectByName(String name);

}
