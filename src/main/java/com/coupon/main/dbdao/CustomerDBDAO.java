package com.coupon.main.dbdao;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
import com.coupon.main.bean.Customer;
import com.coupon.main.dao.CustomerDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;
import com.coupon.main.repository.CouponRepo;
import com.coupon.main.repository.CustomerRepo;

@Component
public class CustomerDBDAO implements CustomerDAO {
	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private CouponRepo couponRepo;

	@Override
	public void createCustomer(Customer c) throws SystemExceptionCoupoun {
		System.out.println("createCustomer");

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CustomerSQLQueries.CREATE_CUSTOMER);

	}

	@Override
	public void removeCustomer(Customer c) throws SystemExceptionCoupoun {
		System.out.println("removeCustomer");

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CompanySQLQueries.REMOVE_COMPANY);

	}

	@Override
	public void updateCustomer(Customer c) throws SystemExceptionCoupoun {
		System.out.println("updateCustomer");

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CustomerSQLQueries.UPDATE_CUSTOMER);

	}

	@Override
	public Customer getCustomer(long id) throws SystemExceptionCoupoun {

		System.out.println("getCompanyByID");

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CustomerSQLQueries.GET_CUSTOMER_BY_ID);

		return null;
	}

	@Override
	public Collection<Customer> getAllCustomers() throws SystemExceptionCoupoun {

		// rs = stmt.executeQuery(CustomerSQLQueries.GET_ALL_CUSTOMERS);
		return null;
	}

	@Override
	public Collection<Coupon> getCoupons() throws SystemExceptionCoupoun {
		System.out.println("Coupons for custmer");

		// rs = stmt.executeQuery(CustomerSQLQueries.GET_ALL_CUSTOMERS);

		return null;
	}

	@Override
	public boolean login(String custName, String password) {
		System.out.println("custName : " + custName + " password :" + password);
		System.out.println("customerRepo : " + customerRepo);
		Customer loginCustomer = customerRepo.login(custName, password);
		System.out.println("loginCustomer : " + loginCustomer);
		if (loginCustomer == null)
			return false;
		return true;
	}

	@Override
	public Customer getCustomerByName(String custName) {
		System.out.println("getCustomerByName");
		System.out.println("custName : " + custName);
		System.out.println("customerRepo : " + customerRepo);
		Customer loginCustomer = customerRepo.findBycustName(custName);
		System.out.println("loginCustomer : " + loginCustomer);

		return loginCustomer;
	}

	public Set<Coupon> purchaseCoupon(Customer customer, Coupon coupon) throws SystemExceptionCoupoun {
		System.out.println("CustomerDBDAO::purchaseCoupon");
		Coupon couponDB = couponRepo.findbyId(coupon.getId());
		System.out.println("couponDB  " + couponDB);
		// TODO
		int amount = couponDB.getAmount();
		if (amount == 0) {
			throw new SystemExceptionCoupoun("the coupon out of stock");
		}
		couponDB.setAmount(amount - 1);

		java.util.Date utilDate = new java.util.Date();
		java.sql.Date sqlDateNow = new java.sql.Date(utilDate.getTime());
		System.out.println("sqlDate  " + sqlDateNow);
		System.out.println("couponDB.getEndDate()" + couponDB.getEndDate());
		System.out.println("sqlDateNow.after(couponDB.getEndDate())" + sqlDateNow.after(couponDB.getEndDate()));
		if (sqlDateNow.after(couponDB.getEndDate())) {
			throw new SystemExceptionCoupoun("the coupon expired");
		}
		System.out.println();
		Set<Customer> customerSet = customerRepo.findCustmerHasCoupon(couponDB.getId(), customer.getId());
		System.out.println("customerSet.isEmpty() ::" + customerSet.isEmpty());
		if (!customerSet.isEmpty()) {
			throw new SystemExceptionCoupoun("you have this Coupon");
		}
		Set<Coupon> couponListBeforeInsertToDB = customer.getCoupons();
		couponListBeforeInsertToDB.add(couponDB);
		customer.setCoupons(couponListBeforeInsertToDB);
		customerRepo.save(customer);
		System.out.println("customer in db after purchaseCoupon:"+customer);
		return couponListBeforeInsertToDB;
	}

	public Set<Coupon>  AllPurchasedCoupons(Customer thisCustomer) {
	System.out.println("CustomerDBDAO:AllPurchasedCoupons");
	System.out.println("Customer :"+thisCustomer);
	Set<Coupon> purchasedCoupon = couponRepo.findAllPurchasedCoupons(thisCustomer.getId());
	System.out.println("purchasedCoupon :"+purchasedCoupon);
		return purchasedCoupon;
		
	}

	public Set<Coupon> getAllPurchasedCouponsByType(Customer thisCustomer, CouponType couponType) {
		System.out.println("CustomerDBDAO:getAllPurchasedCouponsByType");
		System.out.println("Customer :"+thisCustomer);
		System.out.println("couponType :"+couponType);
		Set<Coupon> purchasedCoupon = couponRepo.findAllPurchasedCouponsByType(thisCustomer.getId(),couponType);
		System.out.println("purchasedCoupon :"+purchasedCoupon);
			return purchasedCoupon;
	}

	public Set<Coupon> getAllPurchasedCouponsByPrice(Customer thisCustomer, Double couponPrice) {
		System.out.println("CustomerDBDAO:getAllPurchasedCouponsByPrice");
		System.out.println("Customer :"+thisCustomer);
		System.out.println("couponPrice :"+couponPrice);
		Set<Coupon> purchasedCoupon = couponRepo.findAllPurchasedCouponsByPrice(thisCustomer.getId(),couponPrice);
		System.out.println("purchasedCoupon :"+purchasedCoupon);
			return purchasedCoupon;
	}
}
