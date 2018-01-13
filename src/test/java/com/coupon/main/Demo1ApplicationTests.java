package com.coupon.main;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.coupon.main.bean.Company;
import com.coupon.main.bean.Coupon;
import com.coupon.main.repository.CompanyRepo;
import com.coupon.main.repository.CouponRepo;

@RunWith(SpringRunner.class)
//@ComponentScan(basePackages = { "com.coupon.bean", "com.example.demo"})
@SpringBootTest()
public class Demo1ApplicationTests {
	@Autowired
	private CompanyRepo companyRepo;
	@Autowired
	private CouponRepo couponRepo;
	
	@Test
	public void contextLoads() {
		System.out.println("START");
		
		Company CoTest= new Company("asddsa", "123", "asd@sdad.sad");
		Company CoTest1= new Company("asddsaa", "123a", "aaasd@sdaad.saad");
		companyRepo.save(CoTest);
		companyRepo.save(CoTest1);
		Iterable<Company> list = companyRepo.findAll();
		System.out.println(list);
		Company CoTest3 = null;

		double price=10.0;
		Coupon couponTest1= new Coupon("qazxsw", dateToDateSql(2017,1,3), dateToDateSql(2018,8,2), 43, "fdfd dsfjkdsf", price);
		Coupon couponTest2= new Coupon("qazxdsadsw", dateToDateSql(2217,9,3), dateToDateSql(2218,03,2), 423323, "fdfd defdsfsfjkdsf", price);
		couponTest2.setCompany(CoTest3);
		couponRepo.save(couponTest1);
		couponRepo.save(couponTest2);
//		System.out.println(CoTest1);
		System.out.println("END");
//		 Set<Coupon> coupons = new HashSet<Coupon>();
//		 coupons.add(couponTest2);
//		 CoTest.setCoupons(coupons);
//		 System.out.println(CoTest);
//		 companyRepo.save(CoTest);
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
		System.out.println(companyRepo.findbyId(2)); 
		System.out.println(couponRepo.findbyId(1)); 
		

		
	}
	
	private static Date dateToDateSql(int year,int month,int day) {
		 
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		return new Date(cal.getTimeInMillis());
	}

}
