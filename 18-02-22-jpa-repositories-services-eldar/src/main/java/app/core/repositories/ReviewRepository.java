package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Review;

// repository acts as a collection - DAO
public interface ReviewRepository extends JpaRepository<Review, Integer> {

	List<Review> findByScoreGreaterThan(int score);

}
