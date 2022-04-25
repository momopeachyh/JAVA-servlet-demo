package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.model.User;

//logic to connect to database and fetch records, returns list of users
public class HomeDao implements IHomeDao {
	
	

	@Override
	public List<User> getUsers() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		
		String url = "jdbc:sqlserver://localhost:1433;"
				+"databaseName=credentials;"+
				"encrypt=true;trustServerCertificate=true";
		
		String userDb = "sa";
		
		String passwordDb = "reallyStrongPwd123";
		
		Connection con =DriverManager.getConnection(url,userDb,passwordDb);  
		if(con!=null) {
			System.out.println("Connection established successfully.");
		}
		else {
			System.out.println("Connection unsuccessful.");
		}
		
		String Query = "select * from credentials";
		
		PreparedStatement stmt =con.prepareStatement(Query);
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs!=null) {
			List<User> userList = new ArrayList();
			while (rs.next()) {
				userList.add(new User(
						rs.getString("username"), 
						rs.getString("user_password")));
				
			}
//			Collections.sort(productList,new PriceComparator());
			for(User user:userList) {
				System.out.println(user.getUsername() + " " + user.getPassword());
				
			}
		}
		else {
			System.out.println("No results found.");
		}

		return null;
	}
}
