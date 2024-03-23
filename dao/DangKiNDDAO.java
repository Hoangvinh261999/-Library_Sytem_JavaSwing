/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.dao;

import com.mylibsys.libsystem.entity.NguoiDung;

import com.mylibsys.libsystem.entity.User;
import static com.mylibsys.libsystem.utils.sqlSeverConnect.layKetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author huydo
 */
public class DangKiNDDAO {

    Connection conn = null;
    PreparedStatement sttm = null;

    public int addTK(User us) {
        try {
            String sql = "INSERT INTO TaiKhoan (MaTK, username, password, role,ngayLapTk)\n"
                    + "VALUES (?, ?, ?, N'user', GETDATE());";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, us.getMaTk());
            sttm.setString(2, us.getUsername());
            sttm.setString(3, us.getPassword());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Them thanh cong tk!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return -1;
    }
    
     public int addTKAdmin(User us) {
        try {
            String sql = "INSERT INTO TaiKhoan (MaTK, username, password, role,ngayLapTk)\n"
                    + "VALUES (?, ?, ?, N'Admin', GETDATE());";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, us.getMaTk());
            sttm.setString(2, us.getUsername());
            sttm.setString(3, us.getPassword());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Them thanh cong tk!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return -1;
    }

    public int addND(NguoiDung nd) {
        try {
            String sql = "INSERT INTO NguoiDung (MaND, TenND, SoDienThoai, Email, DiaChi, MaTK)\n"
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, nd.getMaND());
            sttm.setString(2, nd.getTenND());
            sttm.setString(3, nd.getSdt());
            sttm.setString(4, nd.getEmail());
            sttm.setString(5, nd.getDiaChi());
            sttm.setString(6, nd.getMaTK());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Them thanh cong nd!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return -1;
    }

    public User findbyMaTK(String maTk) {
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from TaiKhoan where MaTK = '" + maTk + " ' ";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                User us = new User();
                us.setMaTk(rs.getString(1));
                us.setUsername(rs.getString(2));
                us.setPassword(rs.getString(3));
                return us;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return null;
    }
    
    public User findbyUserName(String username) {
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from TaiKhoan where username = N'" + username + " ' ";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                User us = new User();
                us.setMaTk(rs.getString(1));
                us.setUsername(rs.getString(2));
                us.setPassword(rs.getString(3));
                return us;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return null;
    }
    
    public NguoiDung findbyMaND(String maND) {
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from NguoiDung where MaND = '" + maND + " ' ";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setMaND(rs.getString(1));
                nd.setTenND(rs.getString(2));
                nd.setSdt(rs.getString(3));
                nd.setEmail(rs.getString(4));
                nd.setDiaChi(rs.getString(5));
                nd.setMaTK(rs.getString(6));

                return nd;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return null;
    }
    
    public NguoiDung findbyEmail(String email) {
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from NguoiDung where email = '" + email + " ' ";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setMaND(rs.getString(1));
                nd.setTenND(rs.getString(2));
                nd.setSdt(rs.getString(3));
                nd.setEmail(rs.getString(4));
                nd.setDiaChi(rs.getString(5));
                nd.setMaTK(rs.getString(6));

                return nd;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return null;
    }
}
