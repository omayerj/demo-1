package com.coupon.main.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "COMPANY")
public class Company implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String compName;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String email;
	 @OneToMany(mappedBy = "company", fetch = FetchType.EAGER, cascade =
	 CascadeType.ALL)
	 private Set<Coupon> coupons;
//	@ManyToMany
//	@JoinTable(name = "COM_", joinColumns = @JoinColumn(name = "EMP_ID", referencedColumnName = "ID"),
//	inverseJoinColumns = @JoinColumn(name = "PROJ_ID", referencedColumnName = "ID"))
//	private List<Project> projects;

	public Company() {

	}

	public Company(long id, String compName, String password, String email, Set<Coupon> coupons) {
		super();
		this.id = id;
		this.compName = compName;
		this.password = password;
		this.email = email;
		this.coupons = coupons;
	}

	public Company(String compName, String password, String email) {
		this.compName = compName;
		this.password = password;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(Set<Coupon> coupons) {
		this.coupons = coupons;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", compName=" + compName + ", password=" + password + ", email=" + email
				+ ", coupons=" + coupons + "]";
	}

}
