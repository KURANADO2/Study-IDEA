package com.jing;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 测试工具类
 *
 * @author JING
 * @version V1.0.0
 * @date 2017-6-2
 */
public class TestUtils {
    /**
     * 根据id更新用户信息
     */
    @Test
    public void testUpdateById() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils_V3.getConnection();
            String sql = "UPDATE user SET password = ?, username = ? WHERE id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "789");
            pstmt.setString(2, "赵四");
            pstmt.setInt(3, 3);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("更新成功！");
            } else {
                System.out.println("更新失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils_V3.release(conn, pstmt, null);
        }
    }

    /**
     * 根据id删除用户信息
     */
    @Test
    public void testDeleteById() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils_V3.getConnection();
            String sql = "DELETE FROM user WHERE id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 4);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("删除成功！");
            } else {
                System.out.println("删除失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils_V3.release(conn, pstmt, null);
        }
    }

    /**
     * 添加用户信息
     */
    @Test
    public void testAdd() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils_V2.getConnection();
            String sql = "INSERT INTO user VALUES(NULL, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "李四");
            pstmt.setString(2, "45649865");
            pstmt.setString(3, "18977845632");
            pstmt.setString(4, "安徽省黄山市");
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("添加成功！");
            } else {
                System.out.println("添加失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils_V2.release(conn, pstmt, null);
        }
    }

    /**
     * 根据id查询用户信息
     */
    @Test
    public void testFindUserById() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils_V1.getConnection();
            String sql = "SELECT * FROM user WHERE id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 2);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(2) + "---" + rs.getString
                    ("username"));
            }
            //释放资源的代码不能放在这里，因为前面如果那条语句发生异常将会导致此处的释放资源代码得不到执行造成用完的
            //资源无法释放，所以为了保证资源释放，应该将释放资源的代码放到finally块中
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils_V1.release(conn, pstmt, rs);
        }
    }
}
