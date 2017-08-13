package com.jing;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils_V3 {
	public static String driver;
	public static String url;
	public static String user;
	public static String password;
	/**
	 * 静态代码块加载配置文件信息
	 * */
	static {
		try {
			//1.使用当前类获得类加载器
			ClassLoader classLoader = JDBCUtils_V3.class.getClassLoader();
			//2.使用类加载器获得输入流
			InputStream is = classLoader.getResourceAsStream("db.properties");
			//3.创建一个Properties对象
			Properties properties = new Properties();
			//4.Properties对象加载输入流
			properties.load(is);
			//5.获取相关参数的值
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取连接的方法
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 释放资源的方法
	 * @param conn
	 * @param pstmt
	 * @param rs
	 */
	public static void release(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
