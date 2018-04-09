package com.coupon.main.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.coupon.main.bean.Coupon;
@Service
public interface CouponRepo extends CrudRepository<Coupon, Integer> {
	@Query("SELECT t FROM Coupon t where t.id = :id") 
	Coupon findbyId(@Param("id")long id);

	Set<Coupon> findBytitle(String title);
	
	Set<Coupon> findBycompany_id(long id);
}
