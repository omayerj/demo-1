package com.coupon.main.facad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponSystem {
	@Autowired
	private CompanyFacade compFacade;
	@Autowired
	private CustomerFacade customerFacade;
	@Autowired
	private AdministratorFacade administratorFacade;
	
	public CouponClientFacade login(String name, String paswwrod, String clientType)
	{
		switch (clientType)
		{
			case "company":
				return compFacade.login(name,paswwrod);
			case "customer":
				return customerFacade.login(name,paswwrod);
			case "administrator":
				return administratorFacade.login(name,paswwrod);
		}
		
		// of course should not be here....
		return null;

	}

}
