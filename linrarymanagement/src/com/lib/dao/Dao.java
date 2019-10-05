package com.lib.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	static String url = "jdbc:mysql://localhost:3306/library";
	private static Connection con;

	public static Connection getcon() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
