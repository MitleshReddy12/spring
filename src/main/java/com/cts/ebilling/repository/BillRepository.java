package com.cts.ebilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.ebilling.model.Bill;
import com.cts.ebilling.model.User;


@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

	Bill findByUscNo(Long uscNo);
	
	

}
