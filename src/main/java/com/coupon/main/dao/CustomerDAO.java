package com.coupon.main.dao;

import java.util.Collection;
import java.util.Set;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.Customer;
import com.coupon.main.exception.SystemExceptionCoupoun;

public interface CustomerDAO {

	void createCustomer(Customer c) throws SystemExceptionCoupoun;

	void removeCustomer(Customer c) throws SystemExceptionCoupoun;

	Customer updateCustomer(Customer c) throws SystemExceptionCoupoun;

	Customer getCustomer(long id) throws SystemExceptionCoupoun;

	Set<Customer> getAllCustomers() throws SystemExceptionCoupoun;

	Collection<Coupon> getCoupons() throws SystemExceptionCoupoun;

	boolean login(String custName, String password) throws SystemExceptionCoupoun;

	Customer getCustomerByName(String name) throws SystemExceptionCoupoun;

}
