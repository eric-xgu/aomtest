package org.aom.service;

import org.aom.bean.User;
import org.aom.dao.UserDao;
import org.aom.dao.UserDaoImp;
import org.apache.catalina.startup.UserDatabase;

public class UserServiceImp implements UserService {
	private UserDao userDao=new UserDaoImp();
	@Override
	public User findByNameAndPass(String name, String password) {
		// TODO Auto-generated method stub
		return userDao.findByNameAndPass(name,password);
	}
	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return  userDao.findByName(name);
	}


}
