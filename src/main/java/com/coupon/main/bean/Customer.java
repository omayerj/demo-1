package com.coupon.main.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.json.JSONException;
import org.json.JSONObject;

import net.minidev.json.JSONArray;

@Entity(name = "CUSTOMER")
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String custName;
	@Column(nullable = false)
	private String password;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CUSTOMER_Coupon", joinColumns = @JoinColumn(name = "CUSTOMER_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "Coupon_id", referencedColumnName = "id"))
	private Set<Coupon> coupons;

	public Set<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(Set<Coupon> coupons) {
		this.coupons = coupons;
	}

	public Customer() {

	}

	public Customer(String custName, String password) {

		this.custName = custName;
		this.password = password;

	}

	public Customer(long id, String custName, String password) {
		super();
		this.id = id;
		this.custName = custName;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * @Override public String toString() { String info = ""; try { JSONObject
	 * jsonInfo = new JSONObject(); jsonInfo.put("id",this.id);
	 * jsonInfo.put("password",this.password);
	 * jsonInfo.put("custName",this.custName); // JSONArray couponArray = new
	 * JSONArray(); if(this.coupons != null ){ if(coupons.size() > 0){
	 * 
	 * System.out.println("sdfsgdfgfffgd"); // this.coupons.forEach(coupon->{ //
	 * JSONObject subJson = new JSONObject(); // subJson.put("name",
	 * coupon.getId()); // subJson.put("Title", coupon.getTitle()); //
	 * subJson.put("EndDate", coupon.getEndDate()); // couponArray.put(subJson);
	 * // }); } } // jsonInfo.put("coupons", couponArray); info =
	 * jsonInfo.toString(); return info; } catch (JSONException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } return info; }
	 */

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custName=" + custName + ", password=" + password + "]";

	}
}
