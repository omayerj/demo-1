package com.coupon.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.coupon.main.bean.Company;

public interface CompanyRepo extends CrudRepository<Company, Integer> {

	
	Company findByid (long id);
	

}
