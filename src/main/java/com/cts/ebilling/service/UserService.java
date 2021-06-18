package com.cts.ebilling.service;

import com.cts.ebilling.model.User;

public interface UserService {

	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);
	
}
