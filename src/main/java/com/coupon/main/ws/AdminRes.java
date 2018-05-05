package com.coupon.main.ws;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.main.bean.resources.CompanyResources;
import com.coupon.main.bean.resources.CustomerResources;
import com.coupon.main.exception.SystemExceptionCoupoun;
import com.coupon.main.facad.AdministratorFacade;
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
		// CompanyFacade facade = (AdministratorFacade)
		// request.getSession().getAttribute("facade");
		// System.out.println("AdminRes::getFacade");
		// System.out.println(facade.toString());
		// if (facade == null)
		// {
		// System.out.println("null");
		// return null;
		// }
		// return facade;

	}

	@RequestMapping(value = "/api/administratorRes/createCompany", method = RequestMethod.POST)
	public CompanyResources createCompany(HttpServletRequest request,@RequestBody CompanyResources company) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :"+request);
		System.out.println("createCompany");
		return null;
	}

	@RequestMapping(value = "/api/administratorRes/removeCompany", method = RequestMethod.DELETE)
	public void removeCompany(HttpServletRequest request) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :"+request);
		System.out.println("removeCompany");
	}

	@RequestMapping(value = "/api/administratorRes/updateCompany", method = RequestMethod.PUT)
	public CompanyResources updateCompany(HttpServletRequest request,@RequestBody CompanyResources company) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :"+request);
		System.out.println("updateCompany");
		return null;
	}

	@RequestMapping(value = "/api/administratorRes/getAllCompanys", method = RequestMethod.GET)
	public Collection<CompanyResources> getAllCompanys(HttpServletRequest request) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :"+request);
		System.out.println("getAllCompanys");
		return null;
	}

	@RequestMapping(value = "/api/administratorRes/Company", method = RequestMethod.GET)
	public CompanyResources getCompanyById(@RequestParam(value = "companyId") Long companyId,
			HttpServletRequest request)
			throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("companyId :" + companyId);
		System.out.println("request :"+request);
		System.out.println("getCompanyById");
		return null;
	}

	@RequestMapping(value = "/api/administratorRes/createCustomrer", method = RequestMethod.POST)
	public CustomerResources createCustomrer(HttpServletRequest request ,@RequestBody CustomerResources customer) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :"+request);
		System.out.println("createCustomrer");
		return null;
	}

	@RequestMapping(value = "/api/administratorRes/removeCustomrer", method = RequestMethod.DELETE)
	public void removeCustomrer(HttpServletRequest request) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :"+request);
		System.out.println("removeCustomrer");
	}

	@RequestMapping(value = "/api/administratorRes/updateCustomrer", method = RequestMethod.PUT)
	public CustomerResources updateCustomrer(HttpServletRequest request,@RequestBody CustomerResources customer) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :"+request);
		System.out.println("updateCustomrer");
		return null;
	}

	@RequestMapping(value = "/api/administratorRes/getAllCustomrers", method = RequestMethod.GET)
	public Collection<CustomerResources> getAllCustomrers(HttpServletRequest request) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :"+request);
		System.out.println("getAllCustomrers");
		return null;
	}

	@RequestMapping(value = "/api/administratorRes/Customrer", method = RequestMethod.GET)
	public CustomerResources getCustomrerById(@RequestParam(value = "customrerId") Long customrerId,
			HttpServletRequest request)
			throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("customrerId :" + customrerId);
		System.out.println("request :"+request);
		System.out.println("getCustomrerById");
		return null;
	}

}
