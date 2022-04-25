//package com.training.servlet;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import com.training.jdbc.PriceComparator;
//import com.training.jdbc.Product;
//
//public class Jdbc {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
//		
//		String url = "jdbc:sqlserver://localhost:1433;"
//				+"databaseName=credentials;"+
//				"encrypt=true;trustServerCertificate=true";
//		
//		String user = "sa";
//		
//		String password = "reallyStrongPwd123";
//		
//		Connection con =DriverManager.getConnection(url,user,password);  
//		if(con!=null) {
//			System.out.println("Connection established successfully.");
//		}
//		else {
//			System.out.println("Connection unsuccessful.");
//		}
//		
//		String Query = "select * from credentials";
//		
//		PreparedStatement stmt =con.prepareStatement(Query);
//		
//		ResultSet rs = stmt.executeQuery();
//		
//		if(rs!=null) {
//			List<Product> productList = new ArrayList();
//			while (rs.next()) {
//				productList.add(new Product(
//						rs.getString("prod_name"), 
//						rs.getString("prod_desc"),
//						rs.getInt("price")));
//				
//			}
//			Collections.sort(productList,new PriceComparator());
//			for(Product product:productList) {
//				System.out.println(product.prod_name + " is $"+product.getPrice());
//			}
//		}
//		else {
//			System.out.println("No results found.");
//		}
//
//		
//
//	}
//
//}
