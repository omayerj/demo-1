package com.coupon.main.dbdao;

import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
import com.coupon.main.dao.CouponDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;
import com.coupon.main.repository.CouponRepo;

@Component
public class CouponDBDAO implements CouponDAO {
	@Autowired
	CouponRepo couponRepo;

	@Override
	public Coupon createCoupon(Coupon c) throws SystemExceptionCoupoun {
		Set<Coupon> couponSet = couponRepo.findBytitle(c.getTitle());
		couponSet.isEmpty();
		System.out.println(couponSet);
		System.out.println("couponSet.isEmpty() ::" + couponSet.isEmpty());
		if (!couponSet.isEmpty()) {

			throw new SystemExceptionCoupoun("the title is exists ");
		}

		else {
			System.out.println("createCoupon");
			System.out.println(c);
			couponRepo.save(c);
			couponSet = couponRepo.findBytitle(c.getTitle());
			System.out.println("couponSet.iterator().next()" + couponSet.iterator().next());
			return (couponSet.iterator().next());
		}

	}

	@Override
	public void removeCoupon(Coupon c) throws SystemExceptionCoupoun {

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CouponSQLQueries.REMOVE_COUPON + c.getId());

	}

	@Override
	public void updateCoupon(Coupon c) throws SystemExceptionCoupoun {
		System.out.println("CouponDBDAO::updateCoupon");
		System.out.println(c);
		Set<Coupon> couponSet = couponRepo.findBytitle(c.getTitle());
		couponSet.isEmpty();
		System.out.println(couponSet);
		System.out.println("couponSet.isEmpty() ::" + couponSet.isEmpty());
		if (!couponSet.isEmpty()) {

			throw new SystemExceptionCoupoun("the title is exists ");
		}

		else {
			System.out.println("updateCoupon");
			System.out.println(c);
			couponRepo.save(c);
		}

	}

	@Override
	public Coupon getCoupon(long id) throws SystemExceptionCoupoun {

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CouponSQLQueries.GET_COUPON_BY_ID);

		return null;

	}

	@Override
	public Collection<Coupon> getAllCoupon(long id) throws SystemExceptionCoupoun {
		System.out.println("CouponDBDAO::getAllCoupon-GET_ALL_COUPON_BY_COMPANY");
		System.out.println("CouponDBDAO::ID : " + id);
		System.out.println("findBycompany_id : " + couponRepo.findBycompany_id(id));
		Set<Coupon> allCoupon = (Set<Coupon>) couponRepo.findBycompany_id(id);
		System.out.println("allCoupon :" + allCoupon);
		return allCoupon;

	}

	@Override
	public Collection<Coupon> getCouponByType(CouponType type) throws SystemExceptionCoupoun {

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CouponSQLQueries.GET_COUPON_BY_TYPE);

		return null;
	}

	@Override
	public Coupon getCouponByTitle(String title) throws SystemExceptionCoupoun {

		// PreparedStatement preparedStatement =
		// conn.prepareStatement(CouponSQLQueries.GET_COUPON_BY_TITLE);

		return null;

	}

}
