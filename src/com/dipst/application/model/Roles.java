package com.dipst.application.model;

/**
 * Roles entity. @author MyEclipse Persistence Tools
 */

public class Roles implements java.io.Serializable {

	// Fields

	private Integer id;
	private String roledesc;
	private String roletype;

	// Constructors

	/** default constructor */
	public Roles() {
	}

	/** full constructor */
	public Roles(String roledesc, String roletype) {
		this.roledesc = roledesc;
		this.roletype = roletype;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoledesc() {
		return this.roledesc;
	}

	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}

	public String getRoletype() {
		return this.roletype;
	}

	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}

}