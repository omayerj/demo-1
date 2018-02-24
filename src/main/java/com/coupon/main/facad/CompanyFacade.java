package com.coupon.main.facad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Company;
import com.coupon.main.dbdao.CompanyDBDAO;
@Component
public class CompanyFacade implements CouponClientFacade {
	@Autowired
	private CompanyDBDAO companyDBDAO;
	
	private Company thisCompany;
	
	public CouponClientFacade login(String name, String password) {
		System.out.println(" CompanyFacade::login");
		System.out.println("userName : "+ name +" password :"+ password );
		System.out.println("companyDBDAO :  "+companyDBDAO);
		if (companyDBDAO.login(name, password)) {
//			thisCompany = companyDBDAO.getCompanyByName(name);
			System.out.println("login pass :)");
			return this;
		}
		System.out.println("login dont work :(");
		return null;
	}

}
