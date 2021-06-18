
package com.cts.ebilling.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consumer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "auth_user_id")
	
	private Long id;
	private Long uscNo; 
    private String consumername;
    private Long mobile;
    private String address;
    private Long pincode;
    private Long prev_reading;
    
    private Long present_reading;
    private Double dues;
    private Double bill;
    
    
   
	public Consumer() {

	}



	public Consumer(Long id, Long uscNo, String consumername, Long mobile, String address,Long pincode,
			Long prev_reading, Long present_reading, Double dues, Double bill) {
		super();
		this.id = id;
		this.uscNo = uscNo;
		this.consumername = consumername;
		this.mobile = mobile;
		this.address = address;
		this.pincode =pincode;
		this.prev_reading = prev_reading;
		this.present_reading = present_reading;
		this.dues = dues;
		this.bill = bill;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getUscNo() {
		return uscNo;
	}



	public void setUscNo(Long uscNo) {
		this.uscNo = uscNo;
	}



	public String getConsumername() {
		return consumername;
	}



	public void setConsumername(String consumername) {
		this.consumername = consumername;
	}



	public Long getMobile() {
		return mobile;
	}



	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode)
	{
		this.pincode=pincode;
	}

	public Long getPrev_reading() {
		return prev_reading;
	}



	public void setPrev_reading(Long prev_reading) {
		this.prev_reading = prev_reading;
	}



	public Long getPresent_reading() {
		return present_reading;
	}



	public void setPresent_reading(Long present_reading) {
		this.present_reading = present_reading;
	}



	public Double getDues() {
		return dues;
	}



	public void setDues(Double dues) {
		this.dues = dues;
	}



	public Double getBill() {
		return bill;
	}



	public void setBill(Double bill) {
		this.bill = bill;
	}
	
	

}