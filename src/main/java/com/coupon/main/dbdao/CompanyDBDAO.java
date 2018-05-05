package com.coupon.main.dbdao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.dao.CompanyDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;
import com.coupon.main.repository.CompanyRepo;
import com.coupon.main.repository.CouponRepo;
import com.coupon.main.repository.CustomerRepo;

@Component
public class CompanyDBDAO implements CompanyDAO {
	Logger logger = Logger.getLogger("CompanyDBDAO");
	@Autowired
	private CompanyRepo companyRepo;

	@Autowired
	CouponRepo couponRepo;

	@Autowired
	private CustomerRepo customerRepo;

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
	public Set<Company> getAllCompanies() {
		System.out.println("CompanyDBDAO::getAllCompanies");
		Set<Company> listCompany= companyRepo.findAllCompanies();
		System.out.println("list :" + listCompany);
		return listCompany;

	}

	@Override
	public void createCompany(Company c) throws SystemExceptionCoupoun {
		System.out.println("CompanyDBDAO::createCompany");

		System.out.println();
		Company companyNameCheck = companyRepo.findBycompName(c.getCompName());
		if (companyNameCheck != null) {
			throw new SystemExceptionCoupoun("the company name is exists ");
		}
		System.out.println("createCompany");
		companyRepo.save(c);
		System.out.println("createCompany   passs :)");

	}

	public boolean login(String name, String password) {
		System.out.println("userName : " + name + " password :" + password);
		System.out.println("companyRepo : " + companyRepo);
		Company loginCompany = companyRepo.login(name, password);
		System.out.println("loginCompany : " + loginCompany);
		if (loginCompany == null)
			return false;
		return true;
	}

	public Company getCompany(String name, String password) {
		// System.out.println("userName : "+ name +" password :"+ password );
		logger.info("userName : " + name + " password :" + password);
		System.out.println("companyRepo : " + companyRepo);
		Company getCompany = companyRepo.login(name, password);
		System.out.println("getCompany : " + getCompany);
		return getCompany;
	}

	@Override
	public void removeCompany(Company c) {

		System.out.println("CompanyDBDAO::removeCompany");
		couponRepo.deleteAllByCompanyId(c.getId());
		companyRepo.delete(c);
	}

	@Override
	public Company updateCompany(Company c) {
		System.out.println("CompanyDBDAO::updateCompany");
		System.out.println("before update :" + c);
		companyRepo.updateCompany(c.getId(), c.getEmail(), c.getPassword());
		Company companyUP = companyRepo.findByid(c.getId());
		System.out.println("companyUP : " + companyUP);
		return companyUP;

	}

	@Override
	public Company getCompany(long id) throws SystemExceptionCoupoun {
		System.out.println("CompanyDBDAO::getCompany");
		Company companyDB=companyRepo.findByid(id);
		if (companyDB==null) {
			throw new SystemExceptionCoupoun("Don't have company with this ID  "+ id);	
		}
		System.out.println("companyDB :"+companyDB);
		return companyDB;
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
