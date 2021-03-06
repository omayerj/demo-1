//package com.coupon.main.dbdao;
//
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Collection;
//
//import DAO.JoinTableDAO;
//import Exception.System.DAOException;
//import Exception.System.SystemExceptionCoupoun;
//import Type.java.bens.Company;
//import Type.java.bens.Coupon;
//import Type.java.bens.CouponType;
//import Type.java.bens.Customer;
//import coupon.system.ConnectionPool;
//import sql.queries.CouponSQLQueries;
//import sql.queries.JoinTableSQLQueries;
//
///**
// * The Class JoinTableDBDAO.
// */
//public class JoinTableDBDAO implements JoinTableDAO {
//
//
//	@Override
//	public void deleteCoupon(Coupon c) throws DAOException, SystemExceptionCoupoun {
//		System.out.println(" JoinTableDBDAO::deleteCoupon");
//		Connection conn = null;
//
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//
//			PreparedStatement preparedStatement = conn
//					.prepareStatement(JoinTableSQLQueries.REMOVE_COMPANY_COUPON_COUPON_BY_COUPON_ID);
//			preparedStatement.setLong(1, c.getId());
//			System.out.println(preparedStatement);
//
//			int rowsAffected = preparedStatement.executeUpdate();
//			System.out.println(rowsAffected + " rows affected");
//
//			preparedStatement = conn.prepareStatement(JoinTableSQLQueries.REMOVE_CUSTOMER_COUPON_BY_COUPON_ID);
//			preparedStatement.setLong(1, c.getId());
//			System.out.println(preparedStatement);
//
//			rowsAffected = preparedStatement.executeUpdate();
//			System.out.println(rowsAffected + " rows affected");
//
//		} catch (SQLException | InterruptedException e) {
//			throw new DAOException("delete Coupon '" + c.getId(), e);
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//
//	}
//
//	@Override
//	public void deleteCustomerCoupon(Customer c) throws DAOException, SystemExceptionCoupoun {
//		System.out.println(" JoinTableDBDAO::deleteCustomer_Coupon");
//		Connection conn = null;
//
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//
//			PreparedStatement preparedStatement = conn
//					.prepareStatement(JoinTableSQLQueries.REMOVE_CUSTOMER_COUPON_BY_CUST_ID);
//			preparedStatement.setLong(1, c.getId());
//			System.out.println(preparedStatement);
//
//			int rowsAffected = preparedStatement.executeUpdate();
//			System.out.println(rowsAffected + " rows affected");
//
//		} catch (SQLException | InterruptedException e) {
//			throw new DAOException("deleteCustomer_Coupon '" + c.getCustName(), e);
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//
//	}
//
//	@Override
//	public void createCustomerCoupon(Customer customer, Coupon coupon) throws DAOException, SystemExceptionCoupoun {
//		System.out.println(" Add Customer_Coupon");
//		System.out.println("//////////////Customer/////////////////////////");
//		System.out.println(customer.toString());
//		System.out.println("///////////////Coupon////////////////////////");
//		System.out.println(coupon.toString());
//
//		Connection conn = null;
//
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//
//			PreparedStatement preparedStatement = conn.prepareStatement(JoinTableSQLQueries.ADD_CUSTOMER_COUPON);
//			preparedStatement.setLong(1, customer.getId());
//			preparedStatement.setLong(2, coupon.getId());
//			System.out.println(preparedStatement);
//
//			int rowsAffected = preparedStatement.executeUpdate();
//			System.out.println(rowsAffected + " rows affected");
//
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//
//	}
//
//	@Override
//	public void createCompanyCoupon(Company company, Coupon coupon) throws SystemExceptionCoupoun {
//		System.out.println(" Add Company_Coupon");
//		System.out.println("//////////////Customer/////////////////////////");
//		System.out.println(company.toString());
//		System.out.println("///////////////Coupon////////////////////////");
//		System.out.println(coupon.toString());
//
//		Connection conn = null;
//
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//
//			PreparedStatement preparedStatement = conn.prepareStatement(JoinTableSQLQueries.ADD_COMPANY_COUPON);
//			preparedStatement.setLong(1, company.getId());
//			preparedStatement.setLong(2, coupon.getId());
//			System.out.println(preparedStatement);
//
//			int rowsAffected = preparedStatement.executeUpdate();
//			System.out.println(rowsAffected + " rows affected");
//
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//
//	}
//
//	@Override
//	public boolean isThereCustomerCoupon(long custID, long couponID) throws SystemExceptionCoupoun {
//		boolean log = false;
//		Connection conn = null;
//
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//
//			ResultSet rs;
//
//			PreparedStatement statement = conn.prepareStatement(JoinTableSQLQueries.GET_CUSTOMER_COUPON);
//			statement.setLong(1, custID);
//			statement.setLong(2, couponID);
//			rs = statement.executeQuery();
//
//			System.out.println("SQL ****************SQL");
//			System.out.println(statement.toString());
//
//			while (rs.next()) {
//				String custName = rs.getString("CUST_ID");
//				log = true;
//				System.out.println("custName :" + custName);
//			}
//
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//		System.out.println("///////////////////////////////////////");
//		System.out.println("is There Customer Coupon : " + log);
//		System.out.println("///////////////////////////////////////");
//		return log;
//	}
//
//	public Collection<Coupon> getAllPurchases(long id) throws SystemExceptionCoupoun {
//		System.out.println("get All Purchases");
//		System.out.println("///////////////////////////////////////");
//		Connection conn = null;
//		ArrayList<Coupon> listReslt = new ArrayList<Coupon>();
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//			ResultSet rs;
//
//			PreparedStatement preparedStatement = conn.prepareStatement(JoinTableSQLQueries.GET_All_PURCHASES);
//			preparedStatement.setLong(1, id);
//			rs = preparedStatement.executeQuery();
//			System.out.println("SQL ****************SQL");
//			System.out.println(preparedStatement.toString());
//
//			while (rs.next()) {
//				Long idCoupon = rs.getLong("ID");
//				String title = rs.getString("TITLE");
//				Date startDate = rs.getDate("STARTING_DATE");
//				Date endDate = rs.getDate("END_DATE");
//				int amount = rs.getInt("AMOUNT");
//				String type = rs.getString("TYPE");
//				String message = rs.getString("MESSAGE");
//				double price = rs.getDouble("PRICE");
//
//				Coupon c = new Coupon();
//				c.setId(idCoupon);
//				c.setTitle(title);
//				c.setStartDate(startDate);
//				c.setEndDate(endDate);
//				c.setAmount(amount);
//				c.setType(Enum.valueOf(CouponType.class, type));
//				c.setMessage(message);
//				c.setPrice(price);
//				System.out.println(c.toString());
//				listReslt.add(c);
//
//			}
//			return listReslt;
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//		return null;
//
//	}
//
//	public Collection<Coupon> getAllPurchasesByTypeDAO(long id, CouponType type) throws SystemExceptionCoupoun {
//
//		System.out.println("get All Purchases By Type");
//		System.out.println("///////////////////////////////////////");
//		Connection conn = null;
//		ArrayList<Coupon> listReslt = new ArrayList<Coupon>();
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//			ResultSet rs;
//
//			PreparedStatement preparedStatement = conn.prepareStatement(JoinTableSQLQueries.GET_All_PURCHASES_TYPE);
//			preparedStatement.setLong(1, id);
//			preparedStatement.setString(2, type.toString());
//			rs = preparedStatement.executeQuery();
//			System.out.println("SQL ****************SQL");
//			System.out.println(preparedStatement.toString());
//
//			while (rs.next()) {
//				Long idCoupon = rs.getLong("ID");
//				String title = rs.getString("TITLE");
//				Date startDate = rs.getDate("STARTING_DATE");
//				Date endDate = rs.getDate("END_DATE");
//				int amount = rs.getInt("AMOUNT");
//				String typeDB = rs.getString("TYPE");
//				String message = rs.getString("MESSAGE");
//				double price = rs.getDouble("PRICE");
//
//				Coupon c = new Coupon();
//				c.setId(idCoupon);
//				c.setTitle(title);
//				c.setStartDate(startDate);
//				c.setEndDate(endDate);
//				c.setAmount(amount);
//				c.setType(Enum.valueOf(CouponType.class, typeDB));
//				c.setMessage(message);
//				c.setPrice(price);
//				System.out.println(c.toString());
//				listReslt.add(c);
//
//			}
//			return listReslt;
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//		return null;
//	}
//
//	public Collection<Coupon> getAllPurchasesByPriceDAO(long id, double price) throws SystemExceptionCoupoun {
//		System.out.println("get All Purchases");
//		System.out.println("///////////////////////////////////////");
//		Connection conn = null;
//		ArrayList<Coupon> listReslt = new ArrayList<Coupon>();
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//			ResultSet rs;
//
//			PreparedStatement preparedStatement = conn.prepareStatement(JoinTableSQLQueries.GET_All_PURCHASES_PRICE);
//			preparedStatement.setLong(1, id);
//			preparedStatement.setDouble(2, price);
//			rs = preparedStatement.executeQuery();
//			System.out.println("SQL ****************SQL");
//			System.out.println(preparedStatement.toString());
//
//			while (rs.next()) {
//				Long idCoupon = rs.getLong("ID");
//				String title = rs.getString("TITLE");
//				Date startDate = rs.getDate("STARTING_DATE");
//				Date endDate = rs.getDate("END_DATE");
//				int amount = rs.getInt("AMOUNT");
//				String type = rs.getString("TYPE");
//				String message = rs.getString("MESSAGE");
//				double priceDB = rs.getDouble("PRICE");
//
//				Coupon c = new Coupon();
//				c.setId(idCoupon);
//				c.setTitle(title);
//				c.setStartDate(startDate);
//				c.setEndDate(endDate);
//				c.setAmount(amount);
//				c.setType(Enum.valueOf(CouponType.class, type));
//				c.setMessage(message);
//				c.setPrice(priceDB);
//				System.out.println(c.toString());
//				listReslt.add(c);
//
//			}
//			return listReslt;
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//		return null;
//	}
//
//	public Collection<Coupon> getCouponsWithMaxEndDateDB(long compId, Date maxEndDate) throws SystemExceptionCoupoun {
//		System.out.println("get All Purchases");
//		System.out.println("///////////////////////////////////////");
//		System.out.println("compId : " + compId);
//		System.out.println("maxEndDate : " + maxEndDate);
//
//		Connection conn = null;
//		ArrayList<Coupon> listReslt = new ArrayList<Coupon>();
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//			ResultSet rs;
//
//			PreparedStatement preparedStatement = conn
//					.prepareStatement(JoinTableSQLQueries.GET_All_COUPON_ALL_MAX_DATE_LESS);
//			preparedStatement.setLong(1, compId);
//			preparedStatement.setDate(2, maxEndDate);
//			rs = preparedStatement.executeQuery();
//			System.out.println("SQL ****************SQL");
//			System.out.println(preparedStatement.toString());
//
//			while (rs.next()) {
//				Long idCoupon = rs.getLong("ID");
//				String title = rs.getString("TITLE");
//				Date startDate = rs.getDate("STARTING_DATE");
//				Date endDate = rs.getDate("END_DATE");
//				int amount = rs.getInt("AMOUNT");
//				String type = rs.getString("TYPE");
//				String message = rs.getString("MESSAGE");
//				double priceDB = rs.getDouble("PRICE");
//
//				Coupon c = new Coupon();
//				c.setId(idCoupon);
//				c.setTitle(title);
//				c.setStartDate(startDate);
//				c.setEndDate(endDate);
//				c.setAmount(amount);
//				c.setType(Enum.valueOf(CouponType.class, type));
//				c.setMessage(message);
//				c.setPrice(priceDB);
//				System.out.println(c.toString());
//				listReslt.add(c);
//
//			}
//			return listReslt;
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//		return null;
//	}
//
//	public Collection<Coupon> getCouponsByTypeAndCompany(long compId, CouponType type) throws SystemExceptionCoupoun {
//		System.out.println("get Coupons By Type And Company Id");
//		System.out.println("///////////////////////////////////////");
//		System.out.println("compId : " + compId);
//		System.out.println("type : " + type);
//
//		Connection conn = null;
//		ArrayList<Coupon> listReslt = new ArrayList<Coupon>();
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//			ResultSet rs;
//
//			PreparedStatement preparedStatement = conn
//					.prepareStatement(JoinTableSQLQueries.GET_COUPON_BY_TITLE_FOR_COMPANY);
//			preparedStatement.setLong(1, compId);
//			preparedStatement.setString(2, type.toString());
//			rs = preparedStatement.executeQuery();
//			System.out.println("SQL ****************SQL");
//			System.out.println(preparedStatement.toString());
//
//			while (rs.next()) {
//				Long idCoupon = rs.getLong("ID");
//				String title = rs.getString("TITLE");
//				Date startDate = rs.getDate("STARTING_DATE");
//				Date endDate = rs.getDate("END_DATE");
//				int amount = rs.getInt("AMOUNT");
//				String typeDB = rs.getString("TYPE");
//				String message = rs.getString("MESSAGE");
//				double priceDB = rs.getDouble("PRICE");
//
//				Coupon c = new Coupon();
//				c.setId(idCoupon);
//				c.setTitle(title);
//				c.setStartDate(startDate);
//				c.setEndDate(endDate);
//				c.setAmount(amount);
//				c.setType(Enum.valueOf(CouponType.class, typeDB));
//				c.setMessage(message);
//				c.setPrice(priceDB);
//				System.out.println(c.toString());
//				listReslt.add(c);
//
//			}
//			return listReslt;
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//		return null;
//	}
//
//	public Collection<Coupon> getCouponsWithMaxPriceDB(long id, double price) throws SystemExceptionCoupoun {
//		System.out.println("get All Purchases");
//		System.out.println("///////////////////////////////////////");
//		System.out.println("compId : " + id);
//		System.out.println("price : " + price);
//
//		Connection conn = null;
//		ArrayList<Coupon> listReslt = new ArrayList<Coupon>();
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//			ResultSet rs;
//
//			PreparedStatement preparedStatement = conn
//					.prepareStatement(JoinTableSQLQueries.GET_All_COUPON_ALL_PRICE_LESS);
//			preparedStatement.setLong(1, id);
//			preparedStatement.setDouble(2, price);
//			rs = preparedStatement.executeQuery();
//			System.out.println("SQL ****************SQL");
//			System.out.println(preparedStatement.toString());
//
//			while (rs.next()) {
//				Long idCoupon = rs.getLong("ID");
//				String title = rs.getString("TITLE");
//				Date startDate = rs.getDate("STARTING_DATE");
//				Date endDate = rs.getDate("END_DATE");
//				int amount = rs.getInt("AMOUNT");
//				String type = rs.getString("TYPE");
//				String message = rs.getString("MESSAGE");
//				double priceDB = rs.getDouble("PRICE");
//
//				Coupon c = new Coupon();
//				c.setId(idCoupon);
//				c.setTitle(title);
//				c.setStartDate(startDate);
//				c.setEndDate(endDate);
//				c.setAmount(amount);
//				c.setType(Enum.valueOf(CouponType.class, type));
//				c.setMessage(message);
//				c.setPrice(priceDB);
//				System.out.println(c.toString());
//				listReslt.add(c);
//
//			}
//			return listReslt;
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//		return null;
//	}
//
//	public Collection<Coupon> getCouponsLessFromNow(Date now) throws SystemExceptionCoupoun {
//		System.out.println("get All Purchases");
//		System.out.println("///////////////////////////////////////");
//		System.out.println("Date : " + now);
//
//		Connection conn = null;
//		ArrayList<Coupon> listReslt = new ArrayList<Coupon>();
//		try {
//			// could be in wait state if no connection available!
//			conn = connectionPool.getConnection();
//			ResultSet rs;
//
//			PreparedStatement preparedStatement = conn.prepareStatement(CouponSQLQueries.GET_COUPONS_LESS_FROM_NOW);
//			preparedStatement.setDate(1, now);
//			rs = preparedStatement.executeQuery();
//			System.out.println("SQL ****************SQL");
//			System.out.println(preparedStatement.toString());
//
//			while (rs.next()) {
//				Long idCoupon = rs.getLong("ID");
//				String title = rs.getString("TITLE");
//				Date startDate = rs.getDate("STARTING_DATE");
//				Date endDate = rs.getDate("END_DATE");
//				int amount = rs.getInt("AMOUNT");
//				String type = rs.getString("TYPE");
//				String message = rs.getString("MESSAGE");
//				double priceDB = rs.getDouble("PRICE");
//
//				Coupon c = new Coupon();
//				c.setId(idCoupon);
//				c.setTitle(title);
//				c.setStartDate(startDate);
//				c.setEndDate(endDate);
//				c.setAmount(amount);
//				c.setType(Enum.valueOf(CouponType.class, type));
//				c.setMessage(message);
//				c.setPrice(priceDB);
//				System.out.println(c.toString());
//				listReslt.add(c);
//
//			}
//			return listReslt;
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				connectionPool.returnConnection(conn);
//		}
//		return null;
//
//	}
//}
