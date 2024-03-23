package com.mylibsys.libsystem.utils;

import static com.mylibsys.libsystem.utils.sqlSeverConnect.layKetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class XJdbc {

//    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    private static String dburl = "jdbc:sqlserver://localhost:1433;database=DuAnMau_QuanLyThuVien";
//    private static String username = "sa";
//    private static String password = "12345";

    /*
     * Nạp driver
     */
//    static {
//        try {
//            Class.forName(driver);
//        } catch (ClassNotFoundException ex) {
//            throw new RuntimeException(ex);
//        }
//    }

    /**
     * Xây dựng PreparedStatement
     *
     * @param sql là câu lệnh SQL chứa có thể chứa tham số. Nó có thể là một lời
     * gọi thủ tục lưu
     * @param args là danh sách các giá trị được cung cấp cho các tham số trong
     * câu lệnh sql
     * @return PreparedStatement tạo được
     * @throws java.sql.SQLException lỗi sai cú pháp
     */
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection connection = layKetNoi();
        PreparedStatement pstmt = null;
        if (sql.trim().startsWith("{")) {
            pstmt = connection.prepareCall(sql);
        } else {
            pstmt = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pstmt.setObject(i + 1, args[i]);
        }
        return pstmt;
    }

    public static ResultSet query(String sql, Object... args) {
        try {
            PreparedStatement stmt = XJdbc.getStmt(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = XJdbc.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
