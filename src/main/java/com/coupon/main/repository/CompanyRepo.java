package com.coupon.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;

public interface CompanyRepo extends CrudRepository<Company, Integer> {

	
	Company findByid (long id);
	Company findBycompName (String  compName);
	long deleteByid(long id);
	@Query("SELECT t FROM COMPANY t where t.compName = :name and t.password = :password") 
	Company login(@Param("name")String name,@Param("password") String password);

	
//	@Query("update COMPANY u set u.COMP_NAME:=COMP_NAME, u.PASSWORD:=PASSWORD ,u.EMAIL:=EMAIL where u.ID =:ID")
//	int setFixedFirstnameFor(@Param("ID")Long id,@Param("COMP_NAME")String compName, 
//	@Param("PASSWORD")String password,@Param("EMAIL")String email);
	

	
//	Iterable<Company> findAllByname (long id);
	
	

}
