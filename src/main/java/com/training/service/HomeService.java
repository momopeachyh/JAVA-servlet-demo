package com.training.service;

import java.sql.SQLException;
import java.util.List;
import com.training.model.User;
import com.training.dao.HomeDao;

public class HomeService implements IHomeService {

	@Override
	public boolean validateUser(String userName, String password) throws ClassNotFoundException, SQLException {
		HomeDao dao = new HomeDao();
		List<User> userList = dao.getUsers();
//		if(userName.equals("hwillden") && password.equals("123")) 
		for(User user: userList) {
			if(userName.equals(user.getUsername()) && password.equals(user.getPassword())) {
				return true;
			} 
	}
		return false;
}
}
