package com.coupon.main.dbdao;

import java.util.Collection;

import com.coupon.main.bean.Coupon;
import com.coupon.main.bean.CouponType;
import com.coupon.main.dao.CouponDAO;
import com.coupon.main.exception.SystemExceptionCoupoun;


public class CouponDBDAO implements CouponDAO {


	@Override
	public void createCoupon(Coupon c) throws SystemExceptionCoupoun {
	
//			PreparedStatement preparedStatement = conn.prepareStatement(CouponSQLQueries.CREATE_COUPON);

	}

	@Override
	public void removeCoupon(Coupon c) throws SystemExceptionCoupoun {
		
//			PreparedStatement preparedStatement = conn.prepareStatement(CouponSQLQueries.REMOVE_COUPON + c.getId());
		

	}

	@Override
	public void updateCoupon(Coupon c) throws SystemExceptionCoupoun {
		
//			PreparedStatement preparedStatement = conn.prepareStatement(CouponSQLQueries.UPDATE_COUPON);
			
	}

	@Override
	public Coupon getCoupon(long id) throws SystemExceptionCoupoun {

	
//			PreparedStatement preparedStatement = conn.prepareStatement(CouponSQLQueries.GET_COUPON_BY_ID);
		
		return null;

	}

	@Override
	public Collection<Coupon> getAllCoupon() throws SystemExceptionCoupoun {

		
//			PreparedStatement preparedStatement = conn.prepareStatement(JoinTableSQLQueries.GET_ALL_COUPON_BY_COMPANY);
			
		return null;

	}

	@Override
	public Collection<Coupon> getCouponByType(CouponType type) throws SystemExceptionCoupoun {


//			PreparedStatement preparedStatement = conn.prepareStatement(CouponSQLQueries.GET_COUPON_BY_TYPE);
			
		return null;
	}

	@Override
	public Coupon getCouponByTitle(String title) throws SystemExceptionCoupoun {


//			PreparedStatement preparedStatement = conn.prepareStatement(CouponSQLQueries.GET_COUPON_BY_TITLE);
			
		return null;

	}

}
