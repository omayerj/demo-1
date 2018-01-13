package com.coupon.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	@Query("SELECT t FROM CUSTOMER t where t.id = :id") 
	Coupon findbyId(@Param("id")long id);
}
