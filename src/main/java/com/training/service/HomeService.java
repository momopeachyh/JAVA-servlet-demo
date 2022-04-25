package com.training.service;

import java.sql.SQLException;

import com.training.dao.HomeDao;

public class HomeService implements IHomeService {

	@Override
	public boolean validateUser(String userName, String password) throws ClassNotFoundException, SQLException {
		HomeDao dao = new HomeDao();
		dao.getUsers();
		if(userName.equalsIgnoreCase("adam") && password.equals("pass123")) {
			return true;
		} else {
			return false;
		}
	}
}
