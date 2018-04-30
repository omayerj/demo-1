package com.coupon.main.ws;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.main.facad.AdministratorFacade;
import com.coupon.main.facad.CompanyFacade;
import com.coupon.main.facad.CouponClientFacade;
import com.coupon.main.map.Map;

@RestController
@CrossOrigin(origins = "*")
public class AdminRes {


	@Autowired
	private AdministratorFacade administratorFacade;

	/** The map. */
	@Autowired
	private Map map;
	
	@SuppressWarnings("unused")
	private AdministratorFacade getFacade(HttpServletRequest request) {
	
		CouponClientFacade couponClientFacade = administratorFacade.login("Admin", "1234");
		return (AdministratorFacade) couponClientFacade;
//		 CompanyFacade facade = (AdministratorFacade)	 request.getSession().getAttribute("facade");
//		 System.out.println("AdminRes::getFacade");
//		 System.out.println(facade.toString());
//		 if (facade == null)
//		 {
//			 System.out.println("null");
//			 return null;
//		 }
//		 return facade;

	}


}
