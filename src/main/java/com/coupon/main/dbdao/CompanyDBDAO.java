package com.coupon.main.dbdao;

import java.util.Collection;
import java.util.logging.Logger;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.dao.CompanyDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;

public class CompanyDBDAO implements CompanyDAO {
	Logger logger = Logger.getLogger("CompanyDBDAO");

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

	public boolean login(String name, String password) throws SystemExceptionCoupoun {

		// conn.prepareStatement(CompanySQLQueries.LOGIN_BY_COMPANIES);

		return false;
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
