package com.dipst.application.model;
import java.util.Date;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields
	
	private String uname;
	private String password;
	private String confirmpassword;
	private String street;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	private Date createdate;
	private String userrole;
	private Date logindate;
	private String loginip;
	private String activestatus;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users( String uname, String password,
			String confirmpassword, String street, String city, String state,
			String country, String zipcode, String userrole, String loginip,
			String activestatus) {
		
		this.uname = uname;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.userrole = userrole;
		this.loginip = loginip;
		this.activestatus = activestatus;
	}

	/** full constructor */
	public Users(String uname, String password,
			String confirmpassword, String street, String city, String state,
			String country, String zipcode, Date createdate, String userrole,
			Date logindate, String loginip, String activestatus) {
		
		this.uname = uname;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.createdate = createdate;
		this.userrole = userrole;
		this.logindate = logindate;
		this.loginip = loginip;
		this.activestatus = activestatus;
	}

	// Property accessors


	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return this.confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getUserrole() {
		return this.userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public Date getLogindate() {
		return this.logindate;
	}

	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}

	public String getLoginip() {
		return this.loginip;
	}

	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}

	public String getActivestatus() {
		return this.activestatus;
	}

	public void setActivestatus(String activestatus) {
		this.activestatus = activestatus;
	}

}