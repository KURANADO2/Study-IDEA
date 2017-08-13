package com.jing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by JING on 2017/8/12.
 */
public class QueryAll {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://139.196.93.177:3306/lession1?useUnicode=true&characterEncoding" +
                "=UTF8&useSSL=false";
            String username = "root";
            String password = "123456";
            //2.获取连接
            conn = DriverManager.getConnection(url, username, password);
            //3.获取执行sql语句的对象
            stmt = conn.createStatement();
            //4.编写sql语句
            String sql = "SELECT * FROM user";
            //5.执行sql语句
            rs = stmt.executeQuery(sql);
            //6.处理结果集
            while (rs.next()) {
                System.out.println("ID:" + rs.getInt("id") + " 用户名：" + rs.getString(2) + " 密码："
                    + rs
                    .getString
                        ("password") + " 联系方式：" + rs.getString("phone") + " 地址：" + rs.getString
                    ("address"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭对象，先打开的后关闭
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
