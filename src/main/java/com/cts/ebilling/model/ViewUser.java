package com.cts.ebilling.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class ViewUser {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long uscNo;
    private String username;
    private String address;
    private float bill;
	public ViewUser() {
 
	}
	public ViewUser(Long uscNo, String username, String address, float bill) {
	
		this.uscNo= uscNo;
		this.username = username;
		this.address = address;
		this.bill = bill;
	}
	public Long getUscNo() {
		return uscNo;
	}
	public void setUscNo(Long uscNo) {
		this.uscNo = uscNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getaddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
 
}