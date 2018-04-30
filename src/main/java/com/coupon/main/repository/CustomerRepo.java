package com.coupon.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coupon.main.bean.Customer;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	Customer findByid(long id);
	
	long  deleteByid(long id);
	
	Customer findBycustName(String name);
	
	@Query("SELECT t FROM CUSTOMER t where t.custName = :name and t.password = :password") 
	Customer login(@Param("name")String name,@Param("password") String password);

	
}
