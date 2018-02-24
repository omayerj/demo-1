package com.coupon.main.dbdao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.Customer;
import com.coupon.main.dao.CustomerDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;
import com.coupon.main.repository.CustomerRepo;
@Component
public class CustomerDBDAO implements CustomerDAO {
	@Autowired
	private CustomerRepo customerRepo;

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
		System.out.println("custName : "+ custName +" password :"+ password );
		System.out.println("customerRepo : "+customerRepo);
		Customer loginCustomer = customerRepo.login(custName, password);
		System.out.println("loginCustomer : "+loginCustomer);
		if (loginCustomer == null)
			return false;
		return true;
	}

	@Override
	public Customer getCustomerByName(String name) throws SystemExceptionCoupoun {
		System.out.println("getCustomerByName");

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CustomerSQLQueries.GET_CUSTOMER_BY_NAME);

		return null;
	}

}
