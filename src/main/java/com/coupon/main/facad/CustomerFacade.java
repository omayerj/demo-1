package com.coupon.main.facad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Customer;
import com.coupon.main.dbdao.CustomerDBDAO;

@Component
public class CustomerFacade implements CouponClientFacade {
	@Autowired
	private CustomerDBDAO customerDBDAO;

	private Customer thisCustomer;

	public CouponClientFacade login(String name, String password) {
		System.out.println(" CustomerDBDAO::login");
		System.out.println("userName : " + name + " password :" + password);
		System.out.println("companyDBDAO :  " + customerDBDAO);
		if (customerDBDAO.login(name, password)) {
			// thisCustomer = customerDBDAO.
			System.out.println("login pass :)");
			return this;
		}
		System.out.println("login dont work :(");
		return null;
	}

}
