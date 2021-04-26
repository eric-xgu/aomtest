package org.aom.service;

import org.aom.bean.User;

public interface UserService {

	User findByNameAndPass(String name, String password);

	User findByName(String name);
	
}
