package com.dipst.application.model;

public class Course implements java.io.Serializable {

	// Fields

	private Integer courseid;
	private String coursecode;
	private String coursedesc;
	private String coursestatus;
	private Short duration;

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(String coursecode, String coursedesc, String coursestatus,
			Short duration) {
		this.coursecode = coursecode;
		this.coursedesc = coursedesc;
		this.coursestatus = coursestatus;
		this.duration = duration;
	}

	// Property accessors

	public Integer getCourseid() {
		return this.courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursecode() {
		return this.coursecode;
	}

	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}

	public String getCoursedesc() {
		return this.coursedesc;
	}

	public void setCoursedesc(String coursedesc) {
		this.coursedesc = coursedesc;
	}

	public String getCoursestatus() {
		return this.coursestatus;
	}

	public void setCoursestatus(String coursestatus) {
		this.coursestatus = coursestatus;
	}

	public Short getDuration() {
		return this.duration;
	}

	public void setDuration(Short duration) {
		this.duration = duration;
	}

}
