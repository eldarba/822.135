package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {
	
	

}
