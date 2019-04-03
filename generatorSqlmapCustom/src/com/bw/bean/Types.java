package com.bw.bean;

public class Types {
	private Integer id;

	private String ptype;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype == null ? null : ptype.trim();
	}

	public Types(Integer id, String ptype) {
		super();
		this.id = id;
		this.ptype = ptype;
	}

	public Types() {
		super();
	}

}