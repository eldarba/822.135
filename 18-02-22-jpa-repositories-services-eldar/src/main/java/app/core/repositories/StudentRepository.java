package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Student;

// repository acts as a collection - DAO
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByNameStartingWith(String prefix);

	List<Student> findByNameEndingWith(String suffix);

	List<Student> findByNameContaining(String infix);

	List<Student> findBySchoolId(int schoolId);
}
