package com.coupon.main.ws;

import java.util.Collection;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Customer;
import com.coupon.main.bean.resources.CompanyResources;
import com.coupon.main.bean.resources.CustomerResources;
import com.coupon.main.exception.SystemExceptionCoupoun;
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

	private AdministratorFacade getFacade(HttpServletRequest request) {

//		CouponClientFacade couponClientFacade = administratorFacade.login("Admin", "1234");
//		return (AdministratorFacade) couponClientFacade;
		System.out.println(request.getSession().getAttribute("facade"));
		CouponClientFacade facade = (CouponClientFacade)
		 request.getSession().getAttribute("facade");
		return (AdministratorFacade)facade;

	}

	@RequestMapping(value = "/api/administratorRes/createCompany", method = RequestMethod.POST)
	public void createCompany(HttpServletRequest request, @RequestBody CompanyResources company)
			throws SystemExceptionCoupoun {
		System.out.println("createCompany");
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :" + request);
		System.out.println("company :" + company);
		AdminFacade.createCompany(map.mapCompanyResourcesToCompany(company));

	}

	@RequestMapping(value = "/api/administratorRes/removeCompany", method = RequestMethod.POST)
	public void removeCompany(HttpServletRequest request, @RequestBody CompanyResources company)
			throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :" + request);
		System.out.println("removeCompany");
		System.out.println("company :" + company);
		AdminFacade.removeCompany(map.mapCompanyResourcesToCompany(company));
	}

	@RequestMapping(value = "/api/administratorRes/updateCompany", method = RequestMethod.PUT)
	public CompanyResources updateCompany(HttpServletRequest request, @RequestBody CompanyResources company)
			throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :" + request);
		System.out.println("updateCompany");
		System.out.println("company :" + company);
		Company companyAfterUp = AdminFacade.updateCompany(map.mapCompanyResourcesToCompany(company));
		return map.mapCompanyToCompanyResources(companyAfterUp);
	}

	@RequestMapping(value = "/api/administratorRes/getAllCompanys", method = RequestMethod.GET)
	public Collection<CompanyResources> getAllCompanys(HttpServletRequest request) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :" + request);
		System.out.println("getAllCompanys");
		Set<Company> companyList = AdminFacade.getAllCompanys();

		return map.mapcompanyListTolistCompanyResources(companyList);
	}

	@RequestMapping(value = "/api/administratorRes/Company", method = RequestMethod.GET)
	public CompanyResources getCompanyById(@RequestParam(value = "companyId") Long companyId,
			HttpServletRequest request) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("companyId :" + companyId);
		System.out.println("request :" + request);
		System.out.println("getCompanyById");
		Company companyV = AdminFacade.getCompanyByID(companyId);
		return map.mapCompanyToCompanyResources(companyV);
	}

	@RequestMapping(value = "/api/administratorRes/createCustomrer", method = RequestMethod.POST)
	public void createCustomrer(HttpServletRequest request, @RequestBody CustomerResources customer)
			throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :" + request);
		System.out.println("createCustomrer");
		System.out.println("customer :" + customer);
		AdminFacade.createCustomrer(map.mapCustomerResourcesToCustomer(customer));
	}

	@RequestMapping(value = "/api/administratorRes/removeCustomrer", method = RequestMethod.POST)
	public void removeCustomrer(HttpServletRequest request, @RequestBody CustomerResources customer)
			throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :" + request);
		System.out.println("removeCustomrer");
		System.out.println("customer :" + customer);
		AdminFacade.removeCustomrer(map.mapCustomerResourcesToCustomer(customer));
	}

	@RequestMapping(value = "/api/administratorRes/updateCustomrer", method = RequestMethod.PUT)
	public CustomerResources updateCustomrer(HttpServletRequest request, @RequestBody CustomerResources customer)
			throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :" + request);
		System.out.println("updateCustomrer");
		System.out.println("customer :" + customer);
		Customer afterUPCustomer = AdminFacade.updateCustomrer(map.mapCustomerResourcesToCustomer(customer));
		return map.mapCustomerToCustomerResources(afterUPCustomer);
	}

	@RequestMapping(value = "/api/administratorRes/getAllCustomrers", method = RequestMethod.GET)
	public Collection<CustomerResources> getAllCustomrers(HttpServletRequest request) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("request :" + request);
		System.out.println("getAllCustomrers");
		Set<Customer> customerList = AdminFacade.getAllCustomers();

		return map.mapCustomerListTolistCustomerResources(customerList);
	}

	@RequestMapping(value = "/api/administratorRes/Customrer", method = RequestMethod.GET)
	public CustomerResources getCustomrerById(@RequestParam(value = "customrerId") Long customrerId,
			HttpServletRequest request) throws SystemExceptionCoupoun {
		AdministratorFacade AdminFacade = this.getFacade(request);
		System.out.println("customrerId :" + customrerId);
		System.out.println("request :" + request);
		System.out.println("getCustomrerById");
		System.out.println("customrerId :" + customrerId);
		Customer customerV1 = AdminFacade.getCustomrerById(customrerId);
		return map.mapCustomerToCustomerResources(customerV1);
	}
	
	@RequestMapping(value = "/api/logout", method = RequestMethod.POST)
	public void logout(HttpServletRequest request)
			throws SystemExceptionCoupoun {
		System.out.println("logout");
		CouponClientFacade facade = this.getFacade(request);
		System.out.println("request :" + request);
		request.getSession().removeAttribute("facade");
	}

}
