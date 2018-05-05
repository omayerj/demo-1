package com.coupon.main.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
@Repository
public interface CompanyRepo extends CrudRepository<Company, Integer> {

	
	Company findByid (long id);
	Company findBycompName (String compName);
	long deleteByid(long id);
	
	@Query("SELECT t FROM COMPANY t where t.compName = :name and t.password = :password") 
	Company login(@Param("name")String name,@Param("password") String password);
	
	
	@Modifying
	@Transactional(readOnly=false)
	@Query("UPDATE COMPANY c SET c.email =:email, c.password=:password WHERE c.id = :id ") 
	int  updateCompany(@Param("id")long id,@Param("email") String email,@Param("password") String password);
	
	@Query("SELECT t FROM COMPANY t") 
	Set<Company> findAllCompanies();
	
	
	
//	@Modifying
//	@Transactional(readOnly=false)
//	@Query("UPDATE COMPANY c SET c.email =:email WHERE c.id = :id ") 
//	int  updateCompany(@Param("id")long id,@Param("email") String email);
	
	

	
	
	

}
