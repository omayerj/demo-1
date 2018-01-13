package com.coupon.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coupon.main.bean.Company;

public interface CompanyRepo extends CrudRepository<Company, Integer> {

	
	@Query("SELECT t FROM COMPANY t where t.id = :id") 
	Company findbyId(@Param("id")long id);
	

}
