package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.School;

public interface SchoolRepo extends JpaRepository<School, Integer>{
	
	

}
