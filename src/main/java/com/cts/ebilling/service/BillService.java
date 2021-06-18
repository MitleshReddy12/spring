package com.cts.ebilling.service;

import java.util.List;

import com.cts.ebilling.model.Bill;

public interface BillService {

	public void generateBill(Bill bill);
	
	public static boolean isBillAlreadyPresent(Bill bill) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public double calculateBill(double bill);

	public List<Bill> listAll();
	
}
