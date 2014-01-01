package com.dipst.application.model;

import java.io.Serializable;

public class Studycenterdetail implements Serializable {

	// Fields

	private Integer id;
	private Integer centerid;
	private Integer courseid;
	private String staffname;
	private String designation;
	private String contact;

	// Constructors

	/** default constructor */
	public Studycenterdetail() {
	}

	/** minimal constructor */
	public Studycenterdetail(String staffname, String designation,
			String contact) {
		this.staffname = staffname;
		this.designation = designation;
		this.contact = contact;
	}

	/** full constructor */
	public Studycenterdetail(Integer centerid, Integer courseid,
			String staffname, String designation, String contact) {
		this.centerid = centerid;
		this.courseid = courseid;
		this.staffname = staffname;
		this.designation = designation;
		this.contact = contact;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCenterid() {
		return this.centerid;
	}

	public void setCenterid(Integer centerid) {
		this.centerid = centerid;
	}

	public Integer getCourseid() {
		return this.courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getStaffname() {
		return this.staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
