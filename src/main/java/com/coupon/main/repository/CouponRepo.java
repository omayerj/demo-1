package com.coupon.main.repository;

import java.sql.Date;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
import com.coupon.main.bean.Customer;
@Repository
public interface CouponRepo extends CrudRepository<Coupon, Integer> {
	@Query("SELECT t FROM Coupon t where t.id = :id") 
	Coupon findbyId(@Param("id")long id);

	Set<Coupon> findBytitle(String title);
	
	Set<Coupon> findBytype(CouponType type);

	

	
	Set<Coupon> findBycompany_id(long id);
	
//	@Query("SELECT t FROM Coupon t where t.company_id=:id") 
//	Set<Coupon> findbyCompanyId(@Param("id")long id);

//	@Query("SELECT t.company.id FROM Coupon t ") 
//	Set<Coupon> findbyCompanyIdaaa(@Param("id")long id);

	@Query("SELECT c FROM Coupon c where  c.company.id =:companyId and c.type =:Type") 
	Set<Coupon> findBytypeOfCompany(@Param("Type")CouponType type,@Param("companyId") long id);
	
	@Query("SELECT c FROM Coupon c where  c.company.id =:companyId and c.price <=:priceCoupon") 
	Set<Coupon> findLessOfPrice(@Param("priceCoupon") double price,@Param("companyId") long id);
	
	@Query("SELECT c FROM Coupon c where  c.company.id =:companyId and c.endDate <=:endDate") 
	Set<Coupon> findLessEndDate(@Param("endDate") Date endDate,@Param("companyId") long id);
	
	@Query("select t from Coupon t join t.customers u where u.id = :customerId")
	Set<Coupon> findAllPurchasedCoupons(@Param("customerId")long customerId);
	
	@Query("select t from Coupon t join t.customers u where u.id = :customerId AND t.type=:couponType")
	Set<Coupon> findAllPurchasedCouponsByType(@Param("customerId")long id, @Param("couponType")CouponType couponType);
	
	@Query("select t from Coupon t join t.customers u where u.id = :customerId AND t.price <=:Price")
	Set<Coupon> findAllPurchasedCouponsByPrice(@Param("customerId")long id, @Param("Price")Double couponPrice);
	
	@Query("SELECT c FROM Coupon c ") 
	Set<Coupon> getallCoupons();
	
	
	@Modifying
	@Transactional(readOnly=false)
	@Query("DELETE from Coupon c  WHERE c.company.id =:companyId ") 
	void deleteAllByCompanyId(@Param("companyId")long id);
	@Modifying
	@Transactional(readOnly=false)
	@Query("DELETE from Coupon c  WHERE c.id =:id ") 
	void deletebyId(@Param("id")long id);
	
//	@Query("SELECT c FROM Coupon c where  c.company.id =:companyId and c.price =:priceCoupon") 
//	Set<Coupon> findLessOfPrice(@Param("priceCoupon") double price,@Param("companyId") long id);

	
	
//	@Query("SELECT c FROM Coupon c where c.price =:Price") 
//	Set<Coupon> findLessOfPrice(@Param("Price") double price);

//	@Query("SELECT coup FROM Coupon coup where  coup.price < Price and coup.id IN (SELECT coup.id FROM  coup.company comp where  comp.id:=companyId) ") 
//	Set<Coupon> findLessOfPrice(@Param("companyId") long id,@Param("Price") double price);

//	@Modifying
//	@Transactional(readOnly=false)
//	@Query("UPDATE COMPANY c SET c.email =:email, c.password=:password WHERE c.id = :id ") 
//	int  updateCompany(@Param("id")long id,@Param("email") String email,@Param("password") String password);
}
