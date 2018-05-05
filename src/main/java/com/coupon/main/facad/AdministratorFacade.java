package com.coupon.main.facad;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Customer;
import com.coupon.main.bean.resources.CustomerResources;
import com.coupon.main.dbdao.CompanyDBDAO;
import com.coupon.main.dbdao.CustomerDBDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;

@Component
public class AdministratorFacade implements CouponClientFacade {
	@Autowired
	private CustomerDBDAO customerDBDAO;
	@Autowired
	private CompanyDBDAO companyDBDAO;

	public CouponClientFacade login(String name, String password) {
		System.out.println(" CustomerDBDAO::login");
		System.out.println("userName : " + name + " password :" + password);
		if (name.equals("Admin") && password.equals("1234")) {
			// thisCustomer = customerDBDAO.
			System.out.println("login pass :)");
			return this;
		}
		System.out.println("login dont work :(");
		return null;
	}

	public void createCompany(Company company) throws SystemExceptionCoupoun {
		System.out.println("AdministratorFacade::createCompany");
		System.out.println("company :"+company);
		companyDBDAO.createCompany(company);
	}

	public void removeCompany(Company company) {
		System.out.println("AdministratorFacade::removeCompany");
		System.out.println("removeCompany :"+company);
		companyDBDAO.removeCompany(company);	
	}

	public Company updateCompany(Company company) {
		System.out.println("AdministratorFacade::updateCompany");
		System.out.println("updateCompany :"+company);
		Company companyUP=companyDBDAO.updateCompany(company);	
		return companyUP;
	}

	public Set<Company> getAllCompanys() {
		System.out.println("AdministratorFacade::getAllCompanys");
		Set<Company> setCompany=companyDBDAO.getAllCompanies();
		
		
		return setCompany;
	}

	public Company getCompanyByID(Long companyId) throws SystemExceptionCoupoun {
		System.out.println("AdministratorFacade::getCompanyByID");
		Company company=companyDBDAO.getCompany(companyId);
		return company;
	}

	public void createCustomrer(Customer customer) throws SystemExceptionCoupoun {
		System.out.println("AdministratorFacade::createCustomrer");
		System.out.println("company :"+customer);
		customerDBDAO.createCustomer(customer);		
	}

	public void removeCustomrer(Customer customer) throws SystemExceptionCoupoun {
		System.out.println("AdministratorFacade::createCustomrer");
		System.out.println("company :"+customer);
		customerDBDAO.removeCustomer(customer);			
	}

	public Customer updateCustomrer(Customer customer) throws SystemExceptionCoupoun {
		System.out.println("AdministratorFacade::updateCustomrer");
		System.out.println("company :"+customer);
		Customer customerAfterUP= customerDBDAO.updateCustomer(customer);
		return customerAfterUP;
	}

	public Customer getCustomrerById(Long customrerId) throws SystemExceptionCoupoun {
		System.out.println("AdministratorFacade::getCustomrerById");
		System.out.println("company :"+customrerId);
		Customer customerV=customerDBDAO.getCustomer(customrerId);
		return customerV;
	}

	public Set<Customer> getAllCustomers() throws SystemExceptionCoupoun {
		System.out.println("AdministratorFacade::getAllCustomers");
		Set<Customer> setCustomer=customerDBDAO.getAllCustomers();
		return setCustomer;
	}


	

}
