package com.coupon.main;

import java.sql.Date;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.Customer;
import com.coupon.main.repository.CompanyRepo;
import com.coupon.main.repository.CouponRepo;
import com.coupon.main.repository.CustomerRepo;

@RunWith(SpringRunner.class)
//@ComponentScan(basePackages = { "com.coupon.bean", "com.example.demo"})
@SpringBootTest()
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
		Coupon couponTest1= new Coupon("coupuonAndCustomerTest1", dateToDateSql(2017,1,3), dateToDateSql(2018,8,2), 43, "fdfd dsfjkdsf", price);
		couponRepo.save(couponTest1);
		Coupon couponDb1= couponRepo.findBytitle("coupuonAndCustomerTest1");
		System.out.println("couponDb :"+ couponDb1);
	//////2////
		Coupon couponTest2= new Coupon("coupuonAndCustomerTest2", dateToDateSql(2017,1,3), dateToDateSql(2018,8,2), 43, "fdfd dsfjkdsf", price);
		couponRepo.save(couponTest2);
		Coupon couponDb2= couponRepo.findBytitle("coupuonAndCustomerTest2");
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
		Coupon couponDbnew=couponRepo.findBytitle("coupuonAndCustomerTest2"); 
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
		Coupon couponTest1= new Coupon("qazxsw", dateToDateSql(2017,1,3), dateToDateSql(2018,8,2), 43, "fdfd dsfjkdsf", price);
		Coupon couponTest2= new Coupon("qazxdsadsw", dateToDateSql(2217,9,3), dateToDateSql(2218,03,2), 423323, "fdfd defdsfsfjkdsf", price);
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

}
