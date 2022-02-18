package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Teacher;

// repository acts as a collection - DAO
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
