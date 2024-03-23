/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

/**
 *
 * @author kuteb
 */
public class sqlSeverConnect {

    private static Connection con;

    public static Connection layKetNoi() throws SQLException {
        if (con == null) {
//            String connectUrl = "jdbc:sqlserver://"+ip1+":1433;databaseName=DuAnMau_QuanLyThuVien;user=sa;password=12345";
            String connectUrl = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;user=sa;password=12345";
            con = DriverManager.getConnection(connectUrl);
        }
        System.out.println(con);
        return con;
    }
}
