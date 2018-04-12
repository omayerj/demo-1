package com.coupon.main.ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.mapping.List;
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

@RestController
@CrossOrigin(origins = "*")
public class CompanyRes {
	@Autowired
	private CompanyFacade companyFacade;

	@Autowired
	private Map map;

	private CompanyFacade getCompanyFacade(HttpServletRequest request) {
		// after completing all of the tests + and after completing all of tyhe
		// angular pages and testing them seperatley !!
		// only then we will connect the login page + login servlet -> and add a
		// real login + session!!
		// .. we now will use the real login
		// step 1 - fake login
		// CouponSystem cs = new CouponSystem(); // should be singleton!! (or
		// autowired) using new here just for demo!!
		CouponClientFacade couponClientFacade = companyFacade.login("asddsaa", "123a");
		return (CompanyFacade) couponClientFacade;
		// CompanyFacade facade = (CompanyFacade)
		// request.getSession().getAttribute("facade");
		// System.out.println("CompanyRes::getCompanyFacade");
		// if (facade == null)
		// {
		// // NOT AUTHENTICATED!!!!...
		// }
		// return facade;

	}

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

	@RequestMapping(value = "/api/companyres", method = RequestMethod.GET)
	public Collection<CouponResources> getCompanyByType(@RequestParam(value = "getCouponByType") String CouponByType,
			HttpServletRequest request) throws SystemExceptionCoupoun {
		System.out.println("getCompanyByType");
		CompanyFacade companyFacade = this.getCompanyFacade(request);
		System.out.println("request :"+request);
		System.out.println("CouponByType :" + CouponByType);
		Collection<Coupon> listCouponCollection = companyFacade.getCompanyByType(CouponByType);
		ArrayList<Coupon> listCoupon = new ArrayList<Coupon>(listCouponCollection);
		 System.out.println(" reslt " + listCoupon);
		 Collection<CouponResources> listCouponResources = new
		 ArrayList<CouponResources>();
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
