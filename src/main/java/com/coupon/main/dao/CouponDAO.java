package com.coupon.main.dao;

import java.util.Collection;
import java.util.Set;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
import com.coupon.main.exception.SystemExceptionCoupoun;

public interface CouponDAO {

	Coupon createCoupon(Coupon c) throws SystemExceptionCoupoun;

	void removeCoupon(Coupon c) throws SystemExceptionCoupoun;

	void updateCoupon(Coupon c) throws SystemExceptionCoupoun;

	Coupon getCoupon(long id) throws SystemExceptionCoupoun;

	Collection<Coupon> getCouponByType(CouponType type) throws SystemExceptionCoupoun;

	Coupon getCouponByTitle(String title) throws SystemExceptionCoupoun;

	Collection<Coupon> getAllCoupon(long id) throws SystemExceptionCoupoun;

	Collection<Coupon> getCouponsByMaxPrice(Company company, double price) throws SystemExceptionCoupoun;
}
