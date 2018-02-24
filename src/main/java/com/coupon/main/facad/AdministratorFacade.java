package com.coupon.main.facad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Customer;
import com.coupon.main.dbdao.CustomerDBDAO;

@Component
public class AdministratorFacade implements CouponClientFacade {
	@Autowired
	private CustomerDBDAO customerDBDAO;

	public CouponClientFacade login(String name, String password) {
		System.out.println(" CustomerDBDAO::login");
		System.out.println("userName : " + name + " password :" + password);
		if (name.equals("Admin") && password.equals("1234")) {
			// thisCustomer = customerDBDAO.
			System.out.println("login pass :)");
			return this;
		}
		System.out.println("login dont work :(");
		return null;
	}

}
