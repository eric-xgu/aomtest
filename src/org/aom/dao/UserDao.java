package org.aom.dao;

import org.aom.bean.User;

public interface UserDao {

	 User findByNameAndPass(String name, String password) ;

	 User findByName(String name);

	

}
