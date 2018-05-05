package com.coupon.main.facad;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
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

	public Customer getCustome() {
		System.out.println("CustomerFacade::getCustome");
		return thisCustomer;
	}

	public Customer purchaseCoupon(Coupon coupon) throws SystemExceptionCoupoun {
		System.out.println("CustomerFacade::purchaseCoupon");
		System.out.println(" Coupon  :=>" + coupon);
		customerDBDAO.purchaseCoupon(thisCustomer, coupon);
		// Coupon.setCustomers(thisCustomer);
		// customerDBDAO.purchaseCoupon()
		return thisCustomer;
	}

	public Set<Coupon> getAllPurchasedCoupons() {
		System.out.println("CustomerFacade::getAllPurchasedCoupons");
		Set<Coupon> purchasedCoupon = customerDBDAO.AllPurchasedCoupons(thisCustomer);
		return purchasedCoupon;
	}

	public Set<Coupon> getAllPurchasedCouponsByType(String couponByType) {
		System.out.println("CustomerFacade::getAllPurchasedCouponsByType");
		System.out.println("CouponsByType :" + couponByType);
		CouponType couponType = CouponType.valueOf(couponByType);
		Set<Coupon> purchasedCouponByType = customerDBDAO.getAllPurchasedCouponsByType(thisCustomer, couponType);
		System.out.println("purchasedCouponByType :" + purchasedCouponByType);
		return purchasedCouponByType;
	}

	public Set<Coupon> getAllPurchasedCouponsByPrice(Double couponPrice) {
		System.out.println("CustomerFacade::getAllPurchasedCouponsByPrice");
		System.out.println("Coupons Price : " + couponPrice);
		Set<Coupon> purchasedCouponsByPrice = customerDBDAO.getAllPurchasedCouponsByPrice(thisCustomer, couponPrice);

		return purchasedCouponsByPrice;
	}

}
