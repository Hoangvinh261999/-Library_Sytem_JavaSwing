/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.dao;

import static com.mylibsys.libsystem.ui.LoginUI.nameAdmin;
import com.mylibsys.libsystem.entity.User;
import static com.mylibsys.libsystem.ui.UIND.LoginUIND.nameND;
import static com.mylibsys.libsystem.utils.loginGoogle.gmail;
import com.mylibsys.libsystem.utils.sqlSeverConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr. Dung
 */
public class UserDao extends sqlSeverConnect {

    public static String maTk;
    public List<String> listMail = new ArrayList<>();

    public User getUser(String username) {
        User us = new User();
        try {
            String sql = "select * from TaiKhoan where username=?";
            PreparedStatement ps = layKetNoi().prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                maTk = rs.getString(1);
                System.out.println(rs.getString(1));
                us.setUsername(rs.getString(2));
                us.setPassword(rs.getString(3));

                return us;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(maTk);
        return null;
    }

    public boolean checkLogin(String username, String password) {
        User us = getUser(username);

        if (us != null) {
            if (us.getPassword().equalsIgnoreCase(password)) {

                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                return true;
            }
        }

        JOptionPane.showMessageDialog(null, "Đăng nhập thất bại");
        return false;
    }

    public boolean checkLoginUser(String username, String password) {
        User us = getUser(username);

        if (us != null) {
            if (us.getPassword().equalsIgnoreCase(password)) {

                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                return true;
            }
        }

        JOptionPane.showMessageDialog(null, "Đăng nhập thất bại");
        return false;
    }

    public List<String> getGmail() {
        try {
            String sql = "select email from NguoiDung";
            PreparedStatement ps = layKetNoi().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listMail.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMail;
    }

    public void getAdByGmail(String Usgmail) {
        try {
            String sql = "select TenND from NguoiDung where email = '" + Usgmail + "'";
            PreparedStatement ps = layKetNoi().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nameAdmin = rs.getString(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void getUserByGmail(String Usgmail) {
        try {
            String sql = "select TenND from NguoiDung where email = '" + Usgmail + "'";
            PreparedStatement ps = layKetNoi().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nameND = rs.getString(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setNameADlogin(String username) {
        try {
            String sql = "select TenND from NguoiDung inner join taikhoan on taikhoan.MaTK=nguoidung.MaTK where username = '" + username + "'";
            PreparedStatement ps = layKetNoi().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nameAdmin = rs.getString(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setNameUserlogin(String username) {
        try {
            String sql = "select TenND from NguoiDung inner join taikhoan on taikhoan.MaTK=nguoidung.MaTK where username = '" + username + "'";
            PreparedStatement ps = layKetNoi().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nameND = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getMaTKByGMail() {
        String ma;
        try {
            String sql = "select maTK from NguoiDung where email = '" + gmail + "'";
            PreparedStatement ps = layKetNoi().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ma = rs.getString(1);
                return ma;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
