package com.marticus.technology.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.technology.Repo.TechnologyRepo;
import com.marticus.technology.entity.TechnologyEntity;


@Service
public class TechnologyService {

	@Autowired
	TechnologyRepo technologyRepo;
	
	
	public void saveTechnology(TechnologyEntity technologyEntity) {
		// TODO Auto-generated method stub
		technologyRepo.save(technologyEntity);
	}
		
	
	public TechnologyEntity findTechnologyById(int id)
	{
		return technologyRepo.findTechnologyById(id);
		
	}


	public TechnologyEntity findTechnologyByName(String name) {
		// TODO Auto-generated method stub
		return technologyRepo.findTechnologyByName(name);
	}
}
