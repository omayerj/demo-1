package com.coupon.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	Customer findByid(long id);
	long  deleteByid(long id);
	
}
