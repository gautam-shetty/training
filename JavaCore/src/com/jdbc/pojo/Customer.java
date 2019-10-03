package com.jdbc.pojo;

public class Customer {
	
	String custfname;
	String custlname;
	String custid;
	String address;
	
	public String getCustfname() {
		return custfname;
	}
	public void setCustfname(String custfname) {
		this.custfname = custfname;
	}
	public String getCustlname() {
		return custlname;
	}
	public void setCustlname(String custlname) {
		this.custlname = custlname;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return getCustfname()+" "+getCustlname()+" "+getCustid()+" "+getAddress();
	}

}
