package com.cts.ebilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.ebilling.model.Consumer;


@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

	
}