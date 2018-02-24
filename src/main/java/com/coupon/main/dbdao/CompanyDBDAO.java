package com.coupon.main.dbdao;

import java.util.Collection;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.dao.CompanyDAO;
import com.coupon.main.repository.CompanyRepo;
@Component
public class CompanyDBDAO implements CompanyDAO {
	Logger logger = Logger.getLogger("CompanyDBDAO");
	@Autowired
	private CompanyRepo companyRepo;

	@Override
	public Collection<Coupon> getCoupons() {

		// conn.prepareStatement(JoinTableSQLQueries.GET_ALL_COUPON_BY_COMPANY);

		return null;

	}

	@Override
	public Collection<Long> getCouponsId(Company c) {

		// .prepareStatement(JoinTableSQLQueries.GET_COMPANY_COUPON_BY_COMP_ID);

		return null;
	}

	@Override
	public Collection<Company> getAllCompanies() {

		// rs = stmt.executeQuery(CompanySQLQueries.SELECT_ALL_COMPANIES);
		return null;

	}

	@Override
	public void createCompany(Company c) {

		// conn.prepareStatement(CompanySQLQueries.CREATE_COMPANY);

	}

	public boolean login(String name, String password) {
		System.out.println("userName : "+ name +" password :"+ password );
		System.out.println("companyRepo : "+companyRepo);
		Company loginCompany = companyRepo.login(name, password);
		System.out.println("loginCompany : "+loginCompany);
		if (loginCompany == null)
			return false;
		return true;
	}

	@Override
	public void removeCompany(Company c) {

		// conn.prepareStatement(CompanySQLQueries.REMOVE_COMPANY + c.getId());

	}

	@Override
	public void updateCompany(Company c) {

		// conn.prepareStatement(CompanySQLQueries.UPDATE_COMPANY);

	}

	@Override
	public Company getCompany(long id) {

		// conn.prepareStatement(CompanySQLQueries.GET_COMPANY_BY_ID);

		return null;

	}

	@Override
	public Company getCompanyByName(String name) {

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CompanySQLQueries.SELECT_COMPANIES_BY_NAME);
		return null;
	}

	@Override
	public void removeFromCompanyCoupon(Company c) {
		// .prepareStatement(JoinTableSQLQueries.REMOVE_COMPANY_COUPON_BY_COMP_ID);

	}

}
