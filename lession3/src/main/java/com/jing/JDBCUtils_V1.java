package com.jing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author JING
 * @version V1.0.0 
 * @date 2017-6-2  
 */
public class JDBCUtils_V1 {
	/**
	 * 获取连接的方法
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://139.196.93.177:3306/lession1?useUnicode=true" +
			"&characterEncoding=UTF8&useSSL=false";
		String user = "root";
		String password = "123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
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
