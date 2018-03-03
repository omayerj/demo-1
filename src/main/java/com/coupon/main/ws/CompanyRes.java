package com.coupon.main.ws;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.main.facad.CompanyFacade;

@RestController
@CrossOrigin(origins = "*")
public class CompanyRes {
	
	
	private CompanyFacade getCompanyFacade(HttpServletRequest request)
	{
		// after completing all of the tests + and after completing all of tyhe angular pages and testing them seperatley !!
		// only then we will connect the login page + login servlet -> and add a real login + session!!
		//.. we now will use the real login
		// step 1 - fake login		
		//CouponSystem cs = new CouponSystem(); // should be singleton!! (or autowired) using new here just for demo!!
		//CouponClientFacade facade = cs.login("itworks", "wow", "company");
		//return (CompanyFacade)facade;
		CompanyFacade facade = (CompanyFacade) request.getSession().getAttribute("facade");
		System.out.println("CompanyRes::getCompanyFacade");
		if (facade == null)
		{
			// NOT AUTHENTICATED!!!!...
		}
		return facade;
		
	}
	
	@RequestMapping(value="/api/companyres/getcoupons" , method = RequestMethod.GET
			)
	public String getCoupons(HttpServletRequest request)
	{
		CompanyFacade companyFacade = this.getCompanyFacade(request);
//		String s =  companyFacade.getCoupons();
		return "{" + '"' + "name" + '"' + ":" + '"' + "coupon1" + '"' + "}";
		

	}

}
