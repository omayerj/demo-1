package com.coupon.main.dao;

import java.util.Collection;
import java.util.Set;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.exception.SystemExceptionCoupoun;

public interface CompanyDAO {

	Set<Company> getAllCompanies();

	Collection<Coupon> getCoupons();

	Collection<Long> getCouponsId(Company c);

	void createCompany(Company c) throws SystemExceptionCoupoun;

	void removeCompany(Company c);

	void removeFromCompanyCoupon(Company c);

	Company updateCompany(Company c);

	Company getCompany(long id) throws SystemExceptionCoupoun;

	Company getCompanyByName(String name);

}
