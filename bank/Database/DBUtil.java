package com.yash.bank.Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection con;

	public static Connection getConnection() throws Exception {
		if (con == null || con.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccrud;", "root",
					"Password@1234");
			return con;
		}
		return con;
	}
}
