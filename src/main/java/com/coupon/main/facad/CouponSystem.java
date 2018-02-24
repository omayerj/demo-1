package com.coupon.main.facad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponSystem {
//	private static CouponSystem INSTANCE;
	@Autowired
	private CompanyFacade compFacade;
//	public synchronized static CouponSystem getInstance() {
//		System.out.println("getInstance");
//
//		if (INSTANCE == null) {
//			INSTANCE = new CouponSystem();
//		}
//		return INSTANCE;
//	}
	
	public CouponClientFacade login(String name, String paswwrod, String clientType)
	{
		switch (clientType)
		{
			case "company":
				return compFacade.login(name,paswwrod);
			case "customer":
				// implement
				break;
			case "administrator":
			break;
		}
		
		// of course should not be here....
		return null;

	}

}
