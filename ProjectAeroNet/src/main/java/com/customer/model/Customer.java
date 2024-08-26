package com.customer.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(name="productPlan")
public class Customer {
	@Id
	Integer cid;
	String cname;
	String address;
	Long phno;
	String idproof;
	Customer(){
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getIDproof() {
		return idproof;
	}
	public void setIDproof(String idproof) {
		this.idproof = idproof;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + ", phno=" + phno + ", idproof="
				+ idproof + "]";
	}
	public Customer(Integer cid, String cname, String address, Long phno, String idproof) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.phno = phno;
		this.idproof = idproof;
	}
}