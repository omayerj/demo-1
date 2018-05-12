package com.coupon.main.ws;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.resources.CompanyResources;
import com.coupon.main.bean.resources.CouponResources;
import com.coupon.main.exception.SystemExceptionCoupoun;
import com.coupon.main.facad.CompanyFacade;
import com.coupon.main.facad.CouponClientFacade;
import com.coupon.main.map.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class CompanyRes.
 */
@RestController
@CrossOrigin(origins = "*")
public class CompanyRes {

	/** The company facade. */
	@Autowired
	private CompanyFacade companyFacade;

	/** The map. */
	@Autowired
	private Map map;

	/**
	 * Gets the company facade.
	 *
	 * @param request
	 *            the request
	 * @return the company facade
	 */
	@SuppressWarnings("unused")
	private CompanyFacade getCompanyFacade(HttpServletRequest request) {

		CouponClientFacade couponClientFacade = companyFacade.login("asddsaa", "123a");
		return (CompanyFacade) couponClientFacade;
//		System.out.println(request.getSession().getAttribute("facade"));
//		CouponClientFacade facade = (CouponClientFacade)
//		 request.getSession().getAttribute("facade");
//		return (CompanyFacade)facade;

	}

	/**
	 * Gets the coupons.
	 *
	 * @param request
	 *            the request
	 * @return the coupons
	 * @throws SystemExceptionCoupoun
	 *             the system exception coupoun
	 */
	@RequestMapping(value = "/api/companyres/getcoupons", method = RequestMethod.GET)
	public Collection<CouponResources> getCoupons(HttpServletRequest request) throws SystemExceptionCoupoun {
		CompanyFacade companyFacade = this.getCompanyFacade(request);
		System.out.println(request);
		Collection<Coupon> listCouponCollection = companyFacade.getAllCoupon();
		ArrayList<Coupon> listCoupon = new ArrayList<Coupon>(listCouponCollection);
		System.out.println(" reslt " + listCoupon);
		Collection<CouponResources> listCouponResources = new ArrayList<CouponResources>();
		System.out.println("listCoupon");
		System.out.println("+++++++++++++++++++++++++++=");
		System.out.println(listCoupon);
		for (Coupon coupon : listCoupon) {
			listCouponResources.add(map.mapCouponToCouponResources(coupon));
		}
		System.out.println(listCouponResources);
		return listCouponResources;

	}

	/**
	 * Creates the coupon.
	 *
	 * @param coupon
	 *            the coupon
	 * @param request
	 *            the request
	 * @return the company resources
	 * @throws SystemExceptionCoupoun
	 *             the system exception coupoun
	 */
	@RequestMapping(value = "/api/companyres/createCoupon", method = RequestMethod.POST)
	public CompanyResources createCoupon(@RequestBody CouponResources coupon, HttpServletRequest request)
			throws SystemExceptionCoupoun {
		CompanyFacade companyFacade = this.getCompanyFacade(request);
		System.out.println(request);
		System.out.println(coupon);
		Company company = companyFacade.createCoupon(map.mapCouponResourcesToCoupon(coupon));
		CompanyResources companyResourcesV1 = map.mapCompanyToCompanyResources(company);
		System.out.println(companyResourcesV1);
		return companyResourcesV1;
	}

	/**
	 * Update coupon.
	 *
	 * @param coupon
	 *            the coupon
	 * @param request
	 *            the request
	 * @return the company resources
	 * @throws SystemExceptionCoupoun
	 *             the system exception coupoun
	 */
	@RequestMapping(value = "/api/companyres/updateCoupon", method = RequestMethod.PUT)
	public CompanyResources updateCoupon(@RequestBody CouponResources coupon, HttpServletRequest request)
			throws SystemExceptionCoupoun {
		System.out.println("api/companyres/updateCoupon::updateCoupon");
		CompanyFacade companyFacade = this.getCompanyFacade(request);
		System.out.println(request);
		System.out.println(coupon);
		Company company = companyFacade.updateCoupon(map.mapCouponResourcesToCoupon(coupon));
		CompanyResources companyResourcesV1 = map.mapCompanyToCompanyResources(company);
		System.out.println(companyResourcesV1);
		return companyResourcesV1;
	}

	/**
	 * Gets the company by type.
	 *
	 * @param CouponByType
	 *            the coupon by type
	 * @param request
	 *            the request
	 * @return the company by type
	 * @throws SystemExceptionCoupoun
	 *             the system exception coupoun
	 */
	@RequestMapping(value = "/api/companyres", method = RequestMethod.GET)
	public Collection<CouponResources> getCouponByType(@RequestParam(value = "getCouponByType") String CouponByType,
			HttpServletRequest request) throws SystemExceptionCoupoun {
		System.out.println("getCouponByType");
		CompanyFacade companyFacade = this.getCompanyFacade(request);
		System.out.println("request :" + request);
		System.out.println("CouponByType :" + CouponByType);
		Collection<Coupon> listCouponCollection = companyFacade.getCompanyByType(CouponByType);
		ArrayList<Coupon> listCoupon = new ArrayList<Coupon>(listCouponCollection);
		System.out.println(" reslt " + listCoupon);
		Collection<CouponResources> listCouponResources = new ArrayList<CouponResources>();
		System.out.println("listCoupon");
		System.out.println("+++++++++++++++++++++++++++=");
		System.out.println(listCoupon);
		for (Coupon coupon : listCoupon) {
			listCouponResources.add(map.mapCouponToCouponResources(coupon));
		}
		System.out.println(listCouponResources);
		return listCouponResources;
	}
	@RequestMapping(value = "/api/companyres/less", method = RequestMethod.GET)
	public Collection<CouponResources> getCouponsByMaxPrice(@RequestParam(value = "MaxPrice") double price,
			HttpServletRequest request) throws SystemExceptionCoupoun {
		System.out.println("getCouponsByMaxPrice");
		CompanyFacade companyFacade = this.getCompanyFacade(request);
		System.out.println("request :" + request);
		System.out.println("price :" + price);
		Collection<Coupon> listCouponCollection = companyFacade.getCouponsByMaxPrice(price);
		ArrayList<Coupon> listCoupon = new ArrayList<Coupon>(listCouponCollection);
		System.out.println(" reslt " + listCoupon);
		Collection<CouponResources> listCouponResources = new ArrayList<CouponResources>();
		System.out.println("listCoupon");
		System.out.println("+++++++++++++++++++++++++++=");
		System.out.println(listCoupon);
		for (Coupon coupon : listCoupon) {
			listCouponResources.add(map.mapCouponToCouponResources(coupon));
		}
		System.out.println(listCouponResources);
		return listCouponResources;
	}

	@RequestMapping(value = "/api/companyres/Company", method = RequestMethod.GET)
	public CompanyResources getCompany(HttpServletRequest request) throws SystemExceptionCoupoun {
		CompanyFacade companyFacade = this.getCompanyFacade(request);
		System.out.println(request);
		Company company = companyFacade.getCompany();
		CompanyResources companyRes = map.mapCompanyToCompanyResources(company);
		return companyRes;
	}
	@RequestMapping(value = "/api/companyres/removeCoupoun", method = RequestMethod.POST)
	public void removeCompany(HttpServletRequest request, @RequestBody CouponResources coupon)
			throws SystemExceptionCoupoun {
		CompanyFacade companyFacade = this.getCompanyFacade(request);
		System.out.println("request :" + request);
		System.out.println("removeCoupoun");
		System.out.println("coupon :" + coupon);
		companyFacade.removeCoupon(map.mapCouponResourcesToCoupon(coupon));
	}

	@RequestMapping(value = "/api/companyresGet", method = RequestMethod.GET)
	public Collection<CouponResources> getCouponByEndDate(@RequestParam(value = "getCouponByEndDate") Date EndDate,
			HttpServletRequest request) throws SystemExceptionCoupoun {
		System.out.println("getCouponByEndDate");
		CompanyFacade companyFacade = this.getCompanyFacade(request);
		System.out.println("request :" + request);
		System.out.println("EndDate :" + EndDate);
		Collection<Coupon> listCouponCollection = companyFacade.getCompanyByEndDate(EndDate);
		ArrayList<Coupon> listCoupon = new ArrayList<Coupon>(listCouponCollection);
		System.out.println(" reslt " + listCoupon);
		Collection<CouponResources> listCouponResources = new ArrayList<CouponResources>();
		System.out.println("listCoupon");
		System.out.println("+++++++++++++++++++++++++++=");
		System.out.println(listCoupon);
		for (Coupon coupon : listCoupon) {
			listCouponResources.add(map.mapCouponToCouponResources(coupon));
		}
		System.out.println(listCouponResources);
		return listCouponResources;
	}

	
}
