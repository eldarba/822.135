package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.School;

// repository acts as a collection - DAO
public interface SchoolRepository extends JpaRepository<School, Integer> {

	boolean existsByName(String name);

}
