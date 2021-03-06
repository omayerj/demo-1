package com.coupon.main;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Date;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
import com.coupon.main.bean.Customer;
import com.coupon.main.dbdao.CompanyDBDAO;
import com.coupon.main.facad.CompanyFacade;
import com.coupon.main.facad.CouponClientFacade;
import com.coupon.main.facad.CouponSystem;
import com.coupon.main.repository.CompanyRepo;
import com.coupon.main.repository.CouponRepo;
import com.coupon.main.repository.CustomerRepo;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
@RunWith(SpringRunner.class)
//@ComponentScan(basePackages = { "com.coupon.bean", "com.example.demo"})
@SpringBootTest()
@FixMethodOrder(MethodSorters.DEFAULT)
public class Demo1ApplicationTests {
	@Autowired
	private CompanyRepo companyRepo;
	@Autowired
	private CouponRepo couponRepo;
	@Autowired
	private CustomerRepo customerRepo;
	
	@Test
	public void contextLoads() {
		
		
	}
	@Test
	public void coupuonAndCustomerTest() {
		System.out.println("coupuonAndCustomerTest::start");
		Customer customerTest1= new Customer("newCustomer2", "1234");
		customerRepo.save(customerTest1);
		Customer customerDb= customerRepo.findByid(1);
		System.out.println("customerDb :"+customerDb.toString());
		System.out.println("Add coupuon");
		double price=10.0;
		Coupon couponTest1= new Coupon("coupuonAndCustomerTest1", CouponType.RESTURANS,dateToDateSql(2017,1,3), dateToDateSql(2018,8,2), 43, "fdfd dsfjkdsf", price);
		couponRepo.save(couponTest1);
		Coupon couponDb1=  couponRepo.findBytitle("coupuonAndCustomerTest1").iterator().next();
		System.out.println("couponDb :"+ couponDb1);
	//////2////
		 
		Coupon couponTest2= new Coupon("coupuonAndCustomerTest2", CouponType.ELECTRICTY, dateToDateSql(2017,1,3), dateToDateSql(2018,8,2), 43, "fdfd dsfjkdsf", price);
		couponRepo.save(couponTest2);
		Coupon couponDb2= (Coupon) couponRepo.findBytitle("coupuonAndCustomerTest2").iterator().next();
		System.out.println("couponDb :"+ couponDb2);
	//////2emd///
		Set<Coupon> coupons =new HashSet<Coupon>();
		coupons.add(couponDb2);
		coupons.add(couponDb1);
		customerDb.setCoupons(coupons);
		customerRepo.save(customerDb);
		Customer newCustomerDb= customerRepo.findByid(1);
		System.out.println("customerRepo.findByid(1): "+newCustomerDb);
		System.out.println("getCoupons : "+newCustomerDb.getCoupons().isEmpty());
		couponRepo.findBytitle(newCustomerDb.getCoupons().iterator().next().getTitle());
		System.out.println(newCustomerDb.getCoupons().iterator().next().getTitle());
		Coupon couponDbnew= couponRepo.findBytitle("coupuonAndCustomerTest2").iterator().next(); 
		System.out.println("with  Customers"+couponDbnew.getCustomers().toString());
		System.out.println("coupuonAndCustomerTest::End");
	}
	
	@Test
	public void customerTest() {
		System.out.println("customerTest::start");
		Customer customerTest1= new Customer("newCustomer", "1234");
		customerRepo.save(customerTest1);
		Customer customerDb= customerRepo.findByid(1);
		System.out.println("customerDb :"+customerDb.toString());
		System.out.println("customerTest::End");
	}
	
	private static Date dateToDateSql(int year,int month,int day) {
		 
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		return new Date(cal.getTimeInMillis());
	}
	@Test
//	@Before
	public void coupuonTest() {
System.out.println("START");
		
		Company CoTest= new Company("asddsa", "123", "asd@sdad.sad");
		Company CoTest1= new Company("asddsaa", "123a", "aaasd@sdaad.saad");
		companyRepo.save(CoTest);
		companyRepo.save(CoTest1);
		Iterable<Company> list = companyRepo.findAll();
		System.out.println(list);
		Company CoTest3 = null;
		Collection<Company> ap=(Collection<Company>) companyRepo.findAll();
		System.out.println("sasdasddasdas");
		System.out.println(ap);
		double price=10.0;
		Coupon couponTest1= new Coupon("qazxsw", CouponType.TRAVELLING, dateToDateSql(2017,1,3), dateToDateSql(2018,8,2), 43, "fdfd dsfjkdsf", price);
		Coupon couponTest2= new Coupon("qazxdsadsw", CouponType.FOOD, dateToDateSql(2217,9,3), dateToDateSql(2218,03,2), 423323, "fdfd defdsfsfjkdsf", price);
		couponTest2.setCompany(CoTest3);
		couponRepo.save(couponTest1);
		couponRepo.save(couponTest2);
		System.out.println("END");
		Set<Coupon> coupons = new HashSet<Coupon>();
		coupons.add(couponTest1);
		CoTest1.setCoupons(coupons);
		System.out.println(CoTest1);
		companyRepo.save(CoTest1);
		
		couponTest1.setCompany(CoTest1);
		couponRepo.save(couponTest1);
		 System.out.println("omayerj");
		 list = companyRepo.findAll();
			System.out.println(list); 
		System.out.println(companyRepo.findByid(2)); 
		System.out.println(couponRepo.findbyId(1)); 
		

	}
	
	
	@Test
	public void logInTest() {
		System.out.println("logInTest :: start");
		Company loginPass= companyRepo.login("asddsa", "123");
		System.out.println("Company loginPass :"+loginPass);
		Company loginFaild= companyRepo.login("asddsa", "1230");
		System.out.println("Company loginFaild :"+loginFaild);
		Customer loginPassCus= customerRepo.login("newCustomer2", "1234");
		System.out.println("loginPassCus :"+loginPassCus);
		Customer loginFaildCus= customerRepo.login("newCustomer2", "12345");
		System.out.println("loginFaildCus :"+loginFaildCus);
		assertNotNull(loginPass);
		assertNotNull(loginPassCus);
		assertNull(loginFaildCus);
		assertNull(loginFaild);
		System.out.println("logInTest :: End");

	}
	@Autowired
	private CouponSystem couponSystem;
	@Test
	public void Coupon5_SystemTest() {
		System.out.println("CouponSystemTest :: start");
//		Company CoTest= new Company("asddsa", "123", "asd@sdad.sad");
//		companyRepo.save(CoTest);
		System.out.println("couponSystem :"+couponSystem);
		CouponClientFacade facade = couponSystem.login("asddsa", "123", "company");
		System.out.println("facade :"+facade);
		assertNotNull(facade);
		System.out.println("CouponSystemTest :: End");

	}
	
	@Autowired
	private CompanyDBDAO companyDBDAO;
	@Test
	public void CompanyDAOTest() {
		System.out.println("CompanyDBDAOTest :: start");
		
		System.out.println("companyDBDAO :"+companyDBDAO);
		boolean cheak= companyDBDAO.login("asddsa","123");
		System.out.println("cheak :"+cheak);
		System.out.println("CompanyDBDAOTest :: End");
		assertTrue(cheak);

	}
	
	@Autowired
	private CompanyFacade companyFacade;
	@Test
	public void companyFacadeTest() {
		System.out.println("companyFacadeTest :: start");
		
		System.out.println("companyDBDAO :"+companyDBDAO);
		CouponClientFacade couponClientFacade= companyFacade.login("asddsa","123");
		System.out.println("couponClientFacade :"+couponClientFacade);
		System.out.println("companyFacadeTest :: End");
		assertNotNull(couponClientFacade);

	}
	
	@Test
	public void updateCompanyTest8() {
		System.out.println("updateCompanyTest :: start");
		System.out.println("before update ");
		System.out.println(companyRepo.findByid(1));
		int update=companyRepo.updateCompany(1, "update@update.update", "123");
		System.out.println("update : "+update);
		System.out.println("after update ");
		System.out.println(companyRepo.findByid(1));
		System.out.println("updateCompanyTest :: End");
	}
	
	
}
