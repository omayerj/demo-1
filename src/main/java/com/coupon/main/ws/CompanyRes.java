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
import org.springframework.web.bind.annotation.RestController;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.resources.CompanyResources;
import com.coupon.main.bean.resources.CouponResources;
import com.coupon.main.exception.SystemExceptionCoupoun;
import com.coupon.main.facad.CompanyFacade;
import com.coupon.main.facad.CouponClientFacade;

@RestController
@CrossOrigin(origins = "*")
public class CompanyRes {
	@Autowired
	private CompanyFacade companyFacade;

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

			listCouponResources.add(mapCouponToCouponResources(coupon));
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
		Company company = companyFacade.createCoupon(mapCouponResourcesToCoupon(coupon));
		CompanyResources companyResourcesV1 = mapCompanyToCompanyResources(company);
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
		Company company = companyFacade.updateCoupon(mapCouponResourcesToCoupon(coupon));
		CompanyResources companyResourcesV1 = mapCompanyToCompanyResources(company);
		System.out.println(companyResourcesV1);

		return companyResourcesV1;

	}

	public CompanyResources mapCompanyToCompanyResources(Company company) {
		System.out.println("mapCompanyToCompanyResources");
		CompanyResources companyResourcesV1 = new CompanyResources();
		companyResourcesV1.setCompName(company.getCompName());
		companyResourcesV1.setId(company.getId());
		companyResourcesV1.setEmail(company.getEmail());
		companyResourcesV1.setPassword(company.getPassword());
		// companyResourcesV1.setCoupons(company.getCoupons());
		return companyResourcesV1;
	}

	public Company mapCompanyResourcesToCompany(CompanyResources company) {
		System.out.println("mapCompanyResourcesToCompany");
		Company companyResourcesV1 = new Company();
		companyResourcesV1.setCompName(company.getCompName());
		companyResourcesV1.setId(company.getId());
		companyResourcesV1.setEmail(company.getEmail());
		companyResourcesV1.setPassword(company.getPassword());
		// companyResourcesV1.setCoupons(company.getCoupons());
		return companyResourcesV1;
	}

	public Coupon mapCouponResourcesToCoupon(CouponResources coupon) {
		System.out.println("mapCouponResourcesToCoupon");
		Coupon CouponV1 = new Coupon();
		CouponV1.setId(coupon.getId());
//		Company companyResourcesV1 =mapCompanyResourcesToCompany(coupon.getCompany()); 
//		System.out.println("coupon Get Company from rest"+coupon.getCompany());
//		System.out.println("companyResourcesV1 after map "+companyResourcesV1);
//		 CouponV1.setCompany(companyResourcesV1);
		// CouponV1.setCustomers(coupon.getCustomers());
		CouponV1.setType(coupon.getType());
		CouponV1.setAmount(coupon.getAmount());
		CouponV1.setEndDate(coupon.getEndDate());
		CouponV1.setStartDate(coupon.getStartDate());
		CouponV1.setImage(coupon.getImage());
		CouponV1.setPrice(coupon.getPrice());
		CouponV1.setMessage(coupon.getImage());
		CouponV1.setTitle(coupon.getTitle());
		System.out.println("mapCouponResourcesToCoupon :: END"+ CouponV1);
		return CouponV1;
	}

	public CouponResources mapCouponToCouponResources(Coupon coupon) {
		System.out.println("mapCouponToCouponResources");
		CouponResources CouponV1 = new CouponResources();
		CouponV1.setId(coupon.getId());
		// CouponV1.setCompany(coupon.getCompany());
		// CouponV1.setCustomers(coupon.getCustomers());
		CouponV1.setType(coupon.getType());
		CouponV1.setAmount(coupon.getAmount());
		CouponV1.setEndDate(coupon.getEndDate());
		CouponV1.setStartDate(coupon.getStartDate());
		// CouponV1.setImage(coupon.getImage());
		CouponV1.setPrice(coupon.getPrice());
		CouponV1.setMessage(coupon.getMessage());
		CouponV1.setTitle(coupon.getTitle());
		System.out.println("mapCouponToCouponResources : end");
		return CouponV1;

	}

}
