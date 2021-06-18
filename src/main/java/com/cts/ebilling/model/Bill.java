package com.cts.ebilling.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "auth_user_id")
	
	private Long id;
	private Long uscNo; 
    private String consumername;
    
    private Long prev_reading;
    
    private Long present_reading;
    private int units;
    private Double dues;
    private Double bill;
    
    
   
	public Bill() {

	}



	public Bill(Long id, Long uscNo, String consumername, 
			Long prev_reading, Long present_reading,int units ,Double dues, Double bill) {
		super();
		this.id = id;
		this.uscNo = uscNo;
		this.consumername = consumername;
		this.prev_reading = prev_reading;
		this.present_reading = present_reading;
		this.units=units;
		this.dues = dues;
		this.bill = bill;
	}



	public int getUnits() {
		return units;
	}



	public void setUnits(int units) {
		this.units = units;
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