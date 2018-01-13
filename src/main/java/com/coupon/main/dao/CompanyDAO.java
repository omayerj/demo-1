package com.coupon.main.dao;

import java.util.Collection;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;

public interface CompanyDAO {

	Collection<Company> getAllCompanies();

	Collection<Coupon> getCoupons();

	Collection<Long> getCouponsId(Company c);

	void createCompany(Company c);

	void removeCompany(Company c);

	void removeFromCompanyCoupon(Company c);

	void updateCompany(Company c);

	Company getCompany(long id);

	Company getCompanyByName(String name);

}
