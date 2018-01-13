package com.coupon.main.dao;

import java.util.Collection;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
import com.coupon.main.exception.SystemExceptionCoupoun;

public interface CouponDAO {

	void createCoupon(Coupon c) throws SystemExceptionCoupoun;

	void removeCoupon(Coupon c) throws SystemExceptionCoupoun;

	void updateCoupon(Coupon c) throws SystemExceptionCoupoun;

	Collection<Coupon> getAllCoupon() throws SystemExceptionCoupoun;

	Coupon getCoupon(long id) throws SystemExceptionCoupoun;

	Collection<Coupon> getCouponByType(CouponType type) throws SystemExceptionCoupoun;

	Coupon getCouponByTitle(String title) throws SystemExceptionCoupoun;

}
