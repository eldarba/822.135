package app.core.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.core.entities.School;
import app.core.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
// NATIVE
//	@Query(value =  "select * from student where school_id = :schoolId", nativeQuery = true)
//	List<Student> getAllStudentBySchoolId(int schoolId);

// JPQL 
	@Query("from Student where School.id = :schoolId")
	List<Student> getAllStudentBySchoolId(int schoolId);
	
// DERIVED METHOD
	List<Student> findBySchoolId(int schoolId);
	

}
