package com.coupon.main.facad;

import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
import com.coupon.main.dbdao.CompanyDBDAO;
import com.coupon.main.dbdao.CouponDBDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;

@Component
public class CompanyFacade implements CouponClientFacade {
	@Autowired
	private CompanyDBDAO companyDBDAO;
	@Autowired
	private CouponDBDAO couponDBDAO;

	private Company thisCompany;

	public Company getCompany(String name, String password) {
		System.out.println(" getCompany::login");
		return companyDBDAO.getCompany(name, password);
	}

	public CouponClientFacade login(String name, String password) {
		System.out.println(" CompanyFacade::login");
		System.out.println("userName : " + name + " password :" + password);
		System.out.println("companyDBDAO :  " + companyDBDAO);
		if (companyDBDAO.login(name, password)) {
			this.thisCompany = getCompany(name, password);
			System.out.println("login pass :)");
			return this;
		}
		System.out.println("login dont work :(");
		return null;
	}

	public Company createCoupon(Coupon coupon) throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::createCoupon");
		coupon.setCompany(thisCompany);
		Coupon couponId = couponDBDAO.createCoupon(coupon);
		Set<Coupon> CouponSet = thisCompany.getCoupons();
		CouponSet.add(couponId);
		thisCompany.setCoupons(CouponSet);
		return thisCompany;

	}

	public Collection<Coupon> getAllCoupon() throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::getAllCoupon");
		System.out.println("this Company : " + thisCompany);
		Collection<Coupon> listCoupon = couponDBDAO.getAllCoupon(thisCompany.getId());
		System.out.println(" ID : " + thisCompany.getId());
		System.out.println("listCoupon : " + listCoupon);
		return listCoupon;
	}
	public Collection<Coupon> getCompanyByType(String type) throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::getCompanyByType");
		System.out.println("this Company : " + thisCompany);
		CouponType couponType =   CouponType.valueOf(type);
		Collection<Coupon> listCoupon = couponDBDAO.getCouponByType(couponType);
		System.out.println(" ID : " + thisCompany.getId());
		System.out.println("listCoupon : " + listCoupon);
		return listCoupon;
	}
	public Company updateCoupon(Coupon coupon) throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::updateCoupon");
		coupon.setCompany(thisCompany);
		couponDBDAO.updateCoupon(coupon);
		Collection<Coupon> listCoupon = couponDBDAO.getAllCoupon(thisCompany.getId());
		thisCompany.setCoupons((Set<Coupon>) listCoupon);
		System.out.println("thisCompany after Updeat" + thisCompany);

		return thisCompany;

	}
}
