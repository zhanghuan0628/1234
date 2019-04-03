package com.bw.bean;

import java.util.Date;

public class Goods {
	private Integer id;

	private String pname;

	private Double price;

	private Date sjsj;

	private String descriptions;

	private Integer kcl;

	private String cd;

	private Integer tid;

	private Integer spzt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname == null ? null : pname.trim();
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getSjsj() {
		return sjsj;
	}

	public void setSjsj(Date sjsj) {
		this.sjsj = sjsj;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions == null ? null : descriptions.trim();
	}

	public Integer getKcl() {
		return kcl;
	}

	public void setKcl(Integer kcl) {
		this.kcl = kcl;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd == null ? null : cd.trim();
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getSpzt() {
		return spzt;
	}

	public void setSpzt(Integer spzt) {
		this.spzt = spzt;
	}

	public Goods(Integer id, String pname, Double price, Date sjsj, String descriptions, Integer kcl, String cd,
			Integer tid, Integer spzt) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.sjsj = sjsj;
		this.descriptions = descriptions;
		this.kcl = kcl;
		this.cd = cd;
		this.tid = tid;
		this.spzt = spzt;
	}

	public Goods() {
		super();
	}

}