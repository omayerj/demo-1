package com.coupon.main.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.Customer;
import com.coupon.main.bean.resources.CompanyResources;
import com.coupon.main.bean.resources.CouponResources;
import com.coupon.main.bean.resources.CustomerResources;

@Component
public class Map {

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
		// Company companyResourcesV1
		// =mapCompanyResourcesToCompany(coupon.getCompany());
		// System.out.println("coupon Get Company from
		// rest"+coupon.getCompany());
		// System.out.println("companyResourcesV1 after map
		// "+companyResourcesV1);
		// CouponV1.setCompany(companyResourcesV1);
		// CouponV1.setCustomers(coupon.getCustomers());
		CouponV1.setType(coupon.getType());
		CouponV1.setAmount(coupon.getAmount());
		CouponV1.setEndDate(coupon.getEndDate());
		CouponV1.setStartDate(coupon.getStartDate());
		CouponV1.setImage(coupon.getImage());
		CouponV1.setPrice(coupon.getPrice());
		CouponV1.setMessage(coupon.getMessage());
		CouponV1.setTitle(coupon.getTitle());
		System.out.println("mapCouponResourcesToCoupon :: END" + CouponV1);
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

	public CustomerResources mapCustomerToCustomerResources(Customer customer) {
		System.out.println("mapCustomerToCustomerResources");
		CustomerResources CustomerV1 = new CustomerResources();
		CustomerV1.setCustName(customer.getCustName());
		CustomerV1.setId(customer.getId());
		CustomerV1.setPassword(customer.getPassword());
		// CustomerV1.getCoupons();
		System.out.println("mapCustomerToCustomerResources : end");
		return CustomerV1;

	}

	public Customer mapCustomerResourcesToCustomer(CustomerResources customerResources) {
		System.out.println("mapCustomerResourcesToCustomer");
		Customer CustomerV1 = new Customer();
		CustomerV1.setCustName(customerResources.getCustName());
		CustomerV1.setId(customerResources.getId());
		CustomerV1.setPassword(customerResources.getPassword());
		// CustomerV1.getCoupons();
		System.out.println("mapCustomerResourcesToCustomer : end");
		return CustomerV1;

	}

	public Collection<CouponResources> mapCouponLestTolistCouponResources(Set<Coupon> couponList) {

		ArrayList<Coupon> listCoupon = new ArrayList<Coupon>(couponList);
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

	public Collection<CompanyResources> mapcompanyListTolistCompanyResources(Set<Company> companyList) {
		System.out.println("mapCouponLestTolistCouponResources");
		ArrayList<Company> listCompany = new ArrayList<Company>(companyList);
		System.out.println(" reslt " + listCompany);
		Collection<CompanyResources> listCompanyResources = new ArrayList<CompanyResources>();
		System.out.println("listCoupon");
		System.out.println("+++++++++++++++++++++++++++=");
		System.out.println(listCompany);
		for (Company company : listCompany) {
			listCompanyResources.add(mapCompanyToCompanyResources(company));
		}
		System.out.println(listCompanyResources);

		return listCompanyResources;
	}

	public Collection<CustomerResources> mapCustomerListTolistCustomerResources(Set<Customer> customerList) {
		System.out.println("mapCouponLestTolistCouponResources");
		ArrayList<Customer> listCustomer = new ArrayList<Customer>(customerList);
		System.out.println(" reslt " + listCustomer);
		Collection<CustomerResources> listCustomerResources = new ArrayList<CustomerResources>();
		System.out.println("listCoupon");
		System.out.println("+++++++++++++++++++++++++++=");
		System.out.println(listCustomer);
		for (Customer customer : listCustomer) {
			listCustomerResources.add(mapCustomerToCustomerResources(customer));
		}
		System.out.println(listCustomerResources);

		return listCustomerResources;
	}
}
