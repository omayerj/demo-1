package com.coupon.main.facad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
import com.coupon.main.dbdao.CompanyDBDAO;
import com.coupon.main.dbdao.CouponDBDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;


/**
 * The Class CompanyFacade.
 */
@Component
public class CompanyFacade implements CouponClientFacade {
	
	/** The company DBDAO. */
	@Autowired
	private CompanyDBDAO companyDBDAO;
	
	/** The coupon DBDAO. */
	@Autowired
	private CouponDBDAO couponDBDAO;

	/** The this company. */
	private Company thisCompany;

	/**
	 * Gets the company.
	 *
	 * @param name the name
	 * @param password the password
	 * @return the company
	 */
	public Company getCompany(String name, String password) {
		System.out.println(" getCompany::login");
		return companyDBDAO.getCompany(name, password);
	}

	/**
	 * Login.
	 *
	 * @param name the name
	 * @param password the password
	 * @return the coupon client facade
	 */
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

	/**
	 * Creates the coupon.
	 *
	 * @param coupon the coupon
	 * @return the company
	 * @throws SystemExceptionCoupoun the system exception coupoun
	 */
	public Company createCoupon(Coupon coupon) throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::createCoupon");
		coupon.setCompany(thisCompany);
		Coupon couponId = couponDBDAO.createCoupon(coupon);
		Set<Coupon> CouponSet = thisCompany.getCoupons();
		CouponSet.add(couponId);
		thisCompany.setCoupons(CouponSet);
		return thisCompany;

	}

	/**
	 * Gets the all coupon.
	 *
	 * @return the all coupon
	 * @throws SystemExceptionCoupoun the system exception coupoun
	 */
	public Collection<Coupon> getAllCoupon() throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::getAllCoupon");
		System.out.println("this Company : " + thisCompany);
		Collection<Coupon> listCoupon = couponDBDAO.getAllCoupon(thisCompany.getId());
		System.out.println(" ID : " + thisCompany.getId());
		System.out.println("listCoupon : " + listCoupon);
		return listCoupon;
	}
	
	/**
	 * Gets the company by type.
	 *
	 * @param type the type
	 * @return the company by type
	 * @throws SystemExceptionCoupoun the system exception coupoun
	 */
	public Collection<Coupon> getCompanyByType(String type) throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::getCompanyByType");
		System.out.println("this Company : " + thisCompany);
		CouponType couponType =   CouponType.valueOf(type);
		Collection<Coupon> listCoupon = couponDBDAO.getCouponByType(couponType);
		System.out.println(" ID : " + thisCompany.getId());
		System.out.println("listCoupon : " + listCoupon);
		return listCoupon;
	}
	
	/**
	 * Update coupon.
	 *
	 * @param coupon the coupon
	 * @return the company
	 * @throws SystemExceptionCoupoun the system exception coupoun
	 */
	public Company updateCoupon(Coupon coupon) throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::updateCoupon");
		coupon.setCompany(thisCompany);
		couponDBDAO.updateCoupon(coupon);
		Collection<Coupon> listCoupon = couponDBDAO.getAllCoupon(thisCompany.getId());
		thisCompany.setCoupons((Set<Coupon>) listCoupon);
		System.out.println("thisCompany after Updeat" + thisCompany);

		return thisCompany;

	}
	public Collection<Coupon> getCouponsByMaxPrice( double price) throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::getCouponsByMaxPrice");
		System.out.println("this Company : " + thisCompany);
//		Collection<Coupon> listCoupon = couponDBDAO.getCouponsByMaxPrice(thisCompany,price);
//		Collection<Coupon> listCoupon = couponDBDAO.getAllCoupon(thisCompany.getId());
		Collection<Coupon> listCoupon = couponDBDAO.getCouponsByMaxPrice(thisCompany, price);
//		ArrayList<Coupon> Couponlist = new ArrayList<Coupon>(listCoupon);
//		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7");
//		Set<Coupon> setOfPriceLess =  Couponlist.stream().filter(c -> c.getPrice()<=price).collect(Collectors.toSet());
//		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7");
//		System.out.println("listOfPriceLess"+setOfPriceLess);
//		System.out.println(" ID : " + thisCompany.getId());
		return listCoupon;
	}
	public Company getCompany( ) throws SystemExceptionCoupoun {
		return thisCompany;
		}

	public void removeCoupon(Coupon coupon) throws SystemExceptionCoupoun {
		System.out.println("CompanyFacade::removeCoupon");	
		System.out.println("coupon :"+coupon);
		couponDBDAO.removeCoupon(coupon);
	}
	
}
