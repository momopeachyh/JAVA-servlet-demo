package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.model.User;

public interface IHomeDao {
 public List<User> getUsers() throws ClassNotFoundException, SQLException;
	
}