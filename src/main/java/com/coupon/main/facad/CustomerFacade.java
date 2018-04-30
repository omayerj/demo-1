package com.coupon.main.facad;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.Customer;
import com.coupon.main.dbdao.CustomerDBDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;

@Component
public class CustomerFacade implements CouponClientFacade {
	@Autowired
	private CustomerDBDAO customerDBDAO;

	private Customer thisCustomer;

	public CouponClientFacade login(String name, String password) {
		System.out.println(" CustomerFacade::login");
		System.out.println("userName : " + name + " password :" + password);
		System.out.println("companyDBDAO :  " + customerDBDAO);
		if (customerDBDAO.login(name, password)) {
			 thisCustomer = customerDBDAO.getCustomerByName(name);
			System.out.println("login pass :)");
			return this;
		}
		System.out.println("login dont work :(");
		return null;
	}
	public Customer getCustome(){
		System.out.println("CustomerFacade::getCustome");
		return thisCustomer;
	}
	
	public Customer purchaseCoupon(Coupon coupon) throws SystemExceptionCoupoun{
		System.out.println("CustomerFacade::purchaseCoupon");
		System.out.println(" Coupon  :=>"+coupon);
		customerDBDAO.purchaseCoupon(thisCustomer,coupon);
//		Coupon.setCustomers(thisCustomer);
//		customerDBDAO.purchaseCoupon()
		return thisCustomer;
	}

}
