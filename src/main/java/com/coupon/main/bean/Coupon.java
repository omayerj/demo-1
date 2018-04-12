package com.coupon.main.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Coupon implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	@Column //(unique=true, nullable=true) 
	private String title;
	@Column
	private Date startDate;
	@Column
	private Date endDate;
	@Column
	private int amount;
	@Column
	private CouponType type;
	@Column
	private String message;
	@Column
	private double price;
	@Column
	private String image;
	@ManyToOne
	@JoinColumn(name = "COMPANY_id")
	private Company company;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
//	@ManyToMany(fetch=FetchType.EAGER, cascade = {CascadeType.DETACH , CascadeType.MERGE, CascadeType.REFRESH})
	@JoinTable(name = "CUSTOMER_Coupon", 
		joinColumns = @JoinColumn(name = "coupon_id", referencedColumnName = "id"), 
				inverseJoinColumns = @JoinColumn(name = "customer_id", referencedColumnName = "id"))
	private Set<Customer> customers;

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Coupon(long id, String title, Date startDate,CouponType type, Date endDate, int amount, String message,
			double price) {
		super();
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.message = message;
		this.price = price;
		this.type =type;
	}

	public Coupon(String title,CouponType type, Date startDate, Date endDate, int amount, String message,
			double price) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.message = message;
		this.price = price;
		this.type =type;
	}

	public Coupon(long id, String title) {
		this.id = id;
		this.title = title;
	}

	public Coupon() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		System.out.println("+++++++++startDate++++++++++++");
		System.out.println(startDate.toString());
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public CouponType getType() {
		return type;
	}

	public void setType(CouponType type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", amount=" + amount + ", type=" + type + ", message=" + message + ", price=" + price + ", image="
				+ image + "]";
	}

	
	

}
