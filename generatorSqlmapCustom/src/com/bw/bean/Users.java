package com.bw.bean;

public class Users {
	private Integer id;

	private String uname;

	private String loginname;

	private String loginpwd;

	private Integer utype;

	private String uaddress;

	private Double zhye;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname == null ? null : uname.trim();
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname == null ? null : loginname.trim();
	}

	public String getLoginpwd() {
		return loginpwd;
	}

	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd == null ? null : loginpwd.trim();
	}

	public Integer getUtype() {
		return utype;
	}

	public void setUtype(Integer utype) {
		this.utype = utype;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress == null ? null : uaddress.trim();
	}

	public Double getZhye() {
		return zhye;
	}

	public void setZhye(Double zhye) {
		this.zhye = zhye;
	}

	public Users(Integer id, String uname, String loginname, String loginpwd, Integer utype, String uaddress,
			Double zhye) {
		super();
		this.id = id;
		this.uname = uname;
		this.loginname = loginname;
		this.loginpwd = loginpwd;
		this.utype = utype;
		this.uaddress = uaddress;
		this.zhye = zhye;
	}

	public Users() {
		super();
	}

}