package com.cts.ebilling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cts.ebilling.model.Consumer;
import com.cts.ebilling.repository.ConsumerRepository;

@Service
public class ConsumerService {
	
	@Autowired
    private ConsumerRepository repo;
	
	public List<Consumer> listAll() {
        return repo.findAll();
    }
     
    public void save(Consumer con) {
        repo.save(con);
    }
     
    public Consumer get(long id) {
        return repo.findById(id).get();
    }
    
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}