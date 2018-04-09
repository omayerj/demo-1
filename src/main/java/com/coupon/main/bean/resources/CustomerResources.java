package com.coupon.main.bean.resources;

import java.io.Serializable;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerResources implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String custName;
	private String password;
	private Set<CouponResources> coupons;
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
	public Set<CouponResources> getCoupons() {
		return coupons;
	}
	public void setCoupons(Set<CouponResources> coupons) {
		this.coupons = coupons;
	}
	@Override
	public String toString() {
		return "CustomerResources [id=" + id + ", custName=" + custName + ", password=" + password + ", coupons="
				+ coupons + "]";
	}
	


}
