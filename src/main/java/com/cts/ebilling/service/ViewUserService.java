package com.cts.ebilling.service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cts.ebilling.model.ViewUser;
import com.cts.ebilling.repository.ViewUserRepository;
 
@Service
public class ViewUserService {
	
	@Autowired
    private ViewUserRepository repo;
	
	public List<ViewUser> listAll() {
        return repo.findAll();
    }
     
    public void save(ViewUser std) {
        repo.save(std);
    }
     
    public ViewUser get(long uscNo) {
        return repo.findById(uscNo).get();
    }
     
    public void delete(long uscNo) {
        repo.deleteById(uscNo);
    }
}