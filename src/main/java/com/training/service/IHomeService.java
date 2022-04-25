package com.training.service;

import java.sql.SQLException;

public interface IHomeService {

	boolean validateUser(String userName, String password) throws ClassNotFoundException, SQLException;
}
