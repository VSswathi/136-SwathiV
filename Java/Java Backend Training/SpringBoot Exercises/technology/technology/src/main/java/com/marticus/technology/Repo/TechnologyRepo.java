package com.marticus.technology.Repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.technology.entity.TechnologyEntity;

@Repository
public interface TechnologyRepo extends JpaRepository<TechnologyEntity, Integer> {

	TechnologyEntity findTechnologyById(int id);

	TechnologyEntity findTechnologyByName(String name);

}
