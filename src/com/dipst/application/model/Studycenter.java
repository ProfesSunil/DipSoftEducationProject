package com.dipst.application.model;

import java.io.Serializable;
import java.util.Date;

public class Studycenter implements Serializable {

	// Fields

	private Integer centerid;
	private Integer recNum;
	private Date affilation;
	private String authorisedperson;
	private String affilationNo;
	private String mobileno;
	private Date joiningDate;

	// Constructors

	/** default constructor */
	public Studycenter() {
	}

	/** minimal constructor */
	public Studycenter(String authorisedperson, String affilationNo,
			String mobileno) {
		this.authorisedperson = authorisedperson;
		this.affilationNo = affilationNo;
		this.mobileno = mobileno;
	}

	/** full constructor */
	public Studycenter(Integer recNum, Date affilation,
			String authorisedperson, String affilationNo, String mobileno,
			Date joiningDate) {
		this.recNum = recNum;
		this.affilation = affilation;
		this.authorisedperson = authorisedperson;
		this.affilationNo = affilationNo;
		this.mobileno = mobileno;
		this.joiningDate = joiningDate;
	}

	// Property accessors

	public Integer getCenterid() {
		return this.centerid;
	}

	public void setCenterid(Integer centerid) {
		this.centerid = centerid;
	}

	public Integer getRecNum() {
		return this.recNum;
	}

	public void setRecNum(Integer recNum) {
		this.recNum = recNum;
	}

	public Date getAffilation() {
		return this.affilation;
	}

	public void setAffilation(Date affilation) {
		this.affilation = affilation;
	}

	public String getAuthorisedperson() {
		return this.authorisedperson;
	}

	public void setAuthorisedperson(String authorisedperson) {
		this.authorisedperson = authorisedperson;
	}

	public String getAffilationNo() {
		return this.affilationNo;
	}

	public void setAffilationNo(String affilationNo) {
		this.affilationNo = affilationNo;
	}

	public String getMobileno() {
		return this.mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public Date getJoiningDate() {
		return this.joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

}
