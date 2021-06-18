package com.cts.ebilling.service;
//import java.util.Arrays;
//import java.util.HashSet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.ebilling.model.Bill;
//import com.cts.ebilling.model.Role;
//import com.cts.ebilling.model.User;
import com.cts.ebilling.repository.RoleRepository;
//import com.cts.ebilling.repository.UserRepository;
import com.cts.ebilling.repository.BillRepository;


@Service
public class BillServiceImp implements BillService {
	
	@Autowired
	BCryptPasswordEncoder encoder;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	BillRepository billRepository;
	

	@Override
	public void generateBill(Bill bill) {
		/*user.setPassword(encoder.encode(user.getPassword()));
		user.setStatus("VERIFIED");
		Role userRole = roleRepository.findByRole("SITE_USER");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
		*/
		
		
	}
	@Override
	public double calculateBill(double bill)
	{
		 int units=0;
		 bill=0;
		if(units<100)
		{
		units-=100;
		bill  =units*1.5;
		}
		else if(units>100&&units<200)
		{
		units-=200;
		bill=units*2.5;
		}
		else if(units>200&&units<300)
		{
			units-=300;
			bill=units*3.5;
		}
		else if(units>300&&units<400)
		{
			units-=400;
			bill=units*4.5;
		}
		else
		{
			bill=units*6;
		}
		 return bill;
		
	}
/*
	public boolean isBillAlreadyPresent(Bill bill) {
		boolean isBillAlreadyExists = false;
		Bill existingBill= billRepository.findByUscNo(bill.getUscNo());
		// If user is found in database, then user already exists.
		if(existingBill != null){
			isBillAlreadyExists = true; 
		}
		return isBillAlreadyExists;
		*/
	@Override
	public List<Bill> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
	}


