package com.dipst.application.model;

import java.io.Serializable;

public class Subject implements Serializable {

	// Fields

	private Integer subjectid;
	private Integer courseid;
	private String coursecode;
	private String subjectcode;
	private String subjectdesc;

	// Constructors

	/** default constructor */
	public Subject() {
	}

	/** minimal constructor */
	public Subject(String coursecode, String subjectcode, String subjectdesc) {
		this.coursecode = coursecode;
		this.subjectcode = subjectcode;
		this.subjectdesc = subjectdesc;
	}

	/** full constructor */
	public Subject(Integer courseid, String coursecode, String subjectcode,
			String subjectdesc) {
		this.courseid = courseid;
		this.coursecode = coursecode;
		this.subjectcode = subjectcode;
		this.subjectdesc = subjectdesc;
	}

	// Property accessors

	public Integer getSubjectid() {
		return this.subjectid;
	}

	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}

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

	public String getSubjectcode() {
		return this.subjectcode;
	}

	public void setSubjectcode(String subjectcode) {
		this.subjectcode = subjectcode;
	}

	public String getSubjectdesc() {
		return this.subjectdesc;
	}

	public void setSubjectdesc(String subjectdesc) {
		this.subjectdesc = subjectdesc;
	}

}
