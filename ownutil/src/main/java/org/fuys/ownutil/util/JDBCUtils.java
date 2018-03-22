package org.fuys.ownutil.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC Utility
 * 
 * @author ys
 *
 */
public class JDBCUtils {

	private static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/owndb?useSSL=false&serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "admin";

	private static Connection connection;

	private static Connection getConnection() {
		try {
			if (connection == null) {
				Class.forName(DBDRIVER);
				connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	private static void close() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static int execute(String sql) {
		getConnection();
		int result = 0;
		try {
			Statement statement = connection.createStatement();
			result = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}
	
	public static int preExecute(String sql) {
		getConnection();
		int result = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			result = statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	public static void main(String[] args) {
		// insert
		String sql = "INSERT INTO USER(name,sex) values ('spicy',2)";
		System.out.println(preExecute(sql));
	}

}
