package com.coupon.main.ws;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.main.bean.Customer;
import com.coupon.main.bean.resources.CouponResources;
import com.coupon.main.bean.resources.CustomerResources;
import com.coupon.main.exception.SystemExceptionCoupoun;
import com.coupon.main.facad.CouponClientFacade;
import com.coupon.main.facad.CustomerFacade;
import com.coupon.main.map.Map;

@RestController
@CrossOrigin(origins = "*")
public class CustomerRes {

	@Autowired
	private CustomerFacade customerFacade;

	/** The map. */
	@Autowired
	private Map map;

	@SuppressWarnings("unused")
	private CustomerFacade getFacade(HttpServletRequest request) throws SystemExceptionCoupoun {

		CouponClientFacade couponClientFacade = customerFacade.login("cust", "1234");
		return (CustomerFacade) couponClientFacade;
		// CompanyFacade facade = (CompanyFacade)
		// request.getSession().getAttribute("facade");
		// System.out.println("CustomerRes::getFacade");
		// System.out.println(facade.toString());
		// if (facade == null)
		// {
		// System.out.println("null");
		// return null;
		// }
		// return facade;

	}

	@RequestMapping(value = "/api/customerRes/custome", method = RequestMethod.GET)
	public CustomerResources getCompany(HttpServletRequest request) throws SystemExceptionCoupoun {
		CustomerFacade customerFacade = this.getFacade(request);
		System.out.println(request);
		Customer customer = customerFacade.getCustome();
		CustomerResources customerRes = map.mapCustomerToCustomerResources(customer);
		return customerRes;
	}
	
	@RequestMapping(value = "/api/customerRes/purchaseCoupon", method = RequestMethod.POST)
	public CustomerResources purchaseCoupon(@RequestBody CouponResources coupon,HttpServletRequest request) throws SystemExceptionCoupoun {
		CustomerFacade customerFacade = this.getFacade(request);
		System.out.println(request);
		System.out.println("coupon : "+coupon);
		Customer customer = customerFacade.purchaseCoupon(map.mapCouponResourcesToCoupon(coupon));
		CustomerResources customerRes = map.mapCustomerToCustomerResources(customer);
		return customerRes;
	}
	@RequestMapping(value = "/api/customerRes/getCoupon", method = RequestMethod.GET)
	public CustomerResources getCoupon(HttpServletRequest request) throws SystemExceptionCoupoun {
		CustomerFacade customerFacade = this.getFacade(request);
		System.out.println(request);
//		Customer customer = customerFacade.getCustome();
//		CustomerResources customerRes = map.mapCustomerToCustomerResources(customer);
//		return customerRes;
		return null;
		
	}
	
	@RequestMapping(value = "/api/customerRes/getAllPurchasedCoupons", method = RequestMethod.GET)
	public CustomerResources getAllPurchasedCoupons(HttpServletRequest request) throws SystemExceptionCoupoun {
		CustomerFacade customerFacade = this.getFacade(request);
		System.out.println(request);
//		Customer customer = customerFacade.getCustome();
//		CustomerResources customerRes = map.mapCustomerToCustomerResources(customer);
//		return customerRes;
		return null;
		
	}
	
	@RequestMapping(value = "/api/customerRes/getAllPurchasedCouponsByType", method = RequestMethod.GET)
	public CustomerResources getAllPurchasedCouponsByType(@RequestParam(value = "Type") String CouponByType,
			HttpServletRequest request) throws SystemExceptionCoupoun {
		CustomerFacade customerFacade = this.getFacade(request);
		System.out.println(request);
		System.out.println("CouponByType :"+CouponByType);
//		Customer customer = customerFacade.getCustome();
//		CustomerResources customerRes = map.mapCustomerToCustomerResources(customer);
//		return customerRes;
		return null;
		
	}
	
	@RequestMapping(value = "/api/customerRes/getAllPurchasedCouponsByPrice", method = RequestMethod.GET)
	public CustomerResources getAllPurchasedCouponsByPrice(@RequestParam(value = "Price") Double CouponPrice,
			HttpServletRequest request) throws SystemExceptionCoupoun {
		CustomerFacade customerFacade = this.getFacade(request);
		System.out.println(request);
		System.out.println("CouponPrice :"+CouponPrice);
//		Customer customer = customerFacade.getCustome();
//		CustomerResources customerRes = map.mapCustomerToCustomerResources(customer);
//		return customerRes;
		return null;
		
	}
	
	
}
