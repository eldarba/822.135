package app.core.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Coupon;
import app.core.repositories.CouponRepository;

@Service
@Transactional
public class CouponService {

	@Autowired
	private CouponRepository couponRepo;

	// CREATE
	public int addCoupon(Coupon coupon) {
		if (couponRepo.existsById(coupon.getId())) {
			throw new RuntimeException("addCoupon faild. already exist");
		} else {
			return couponRepo.save(coupon).getId();
		}
	}

	// READ
	public Coupon getCouponById(int couponId) {
		Optional<Coupon> opt = this.couponRepo.findById(couponId);
		if (opt.isPresent()) {
			Coupon coupon = opt.get();
			return coupon;
		} else {
			throw new RuntimeException("getCouponById faild. not found");
		}
	}

	// UPDATE
	public void updateCoupon(Coupon coupon) {
		if (couponRepo.existsById(coupon.getId())) {
			couponRepo.save(coupon);
		} else {
			throw new RuntimeException("updateCoupon faild. coupon not found");
		}
	}

	// DELETE
	public void deleteCoupon(int couopnId) {
		Coupon coupon = getCouponById(couopnId);
		this.couponRepo.delete(coupon);

	}

}
