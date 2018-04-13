package com.coupon.main.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
@Service
public interface CouponRepo extends CrudRepository<Coupon, Integer> {
	@Query("SELECT t FROM Coupon t where t.id = :id") 
	Coupon findbyId(@Param("id")long id);

	Set<Coupon> findBytitle(String title);
	
	Set<Coupon> findBytype(CouponType type);
	
	Set<Coupon> findBycompany_id(long id);
	
//	@Query("SELECT t FROM Coupon t where t.company_id") 
//	Set<Coupon> findbyCompanyId(@Param("id")long id);
	
//	@Query("SELECT c FROM Coupon c where c.company_id =:id and c.price < Price ") 
//	Set<Coupon> findLessOfPrice(@Param("id") long id,@Param("Price") double price);

//	@Modifying
//	@Transactional(readOnly=false)
//	@Query("UPDATE COMPANY c SET c.email =:email, c.password=:password WHERE c.id = :id ") 
//	int  updateCompany(@Param("id")long id,@Param("email") String email,@Param("password") String password);
}
