package com.coupon.main.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.Customer;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	Customer findByid(long id);
	
	long  deleteByid(long id);
	
	Customer findBycustName(String name);
	
	@Query("SELECT t FROM CUSTOMER t where t.custName = :name and t.password = :password") 
	Customer login(@Param("name")String name,@Param("password") String password);
	

	
	@Query("select t from CUSTOMER t join t.coupons u where u.id = :couponId And t.id=:custmerId")
	Set<Customer> findCustmerHasCoupon(@Param("couponId")long couponId,@Param("custmerId")long custmerId);

	@Query("select t from CUSTOMER t join t.coupons u where u.id = :couponId")
	Set<Customer> findAllByUsername(@Param("couponId")long couponId);
	
//	 cc where cc.customerId = :username
//	@Query("SELECT c FROM Coupon c where  c.company.id =:companyId and c.price <=:priceCoupon") 
//	Set<Coupon> findLessOfPrice(@Param("priceCoupon") double price,@Param("companyId") long id);
//	
//	select e 
//	from Event e join user_event ue on ue.event_id = e.id 
//			where ue.user_id = :userId and e.startDate > CURRENT_TIMESTAMP"
	
	
	
//	@Query("select t from Test t join User u where u.username = :username")
//	List<Test> findAllByUsername(@Param("username")String username);
	
//	@Query("SELECT t FROM CUSTOMER t where t.custName = :name and t.password = :password") 
//	Customer haveCoupon(@Param("name")String name,@Param("password") String password);
	
//	@Query("SELECT c FROM CUSTOMER c where  c.company.id =:companyId and c.price <=:priceCoupon") 
//	Set<Coupon> findLessOfPrice(@Param("priceCoupon") double price,@Param("companyId") long id);
	

	
}
