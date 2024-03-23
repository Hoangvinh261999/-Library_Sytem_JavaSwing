/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.dao;

import com.mylibsys.libsystem.utils.dateFormart;
import com.mylibsys.libsystem.entity.phieuMuon;
import com.mylibsys.libsystem.utils.dateFormart;
import static com.mylibsys.libsystem.utils.dateFormart.formatDate;
import static com.mylibsys.libsystem.utils.sqlSeverConnect.layKetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kuteb
 */
public class phieuMuonDao  {

    List<phieuMuon> list = new ArrayList<>();
    List<phieuMuon> listXoa = new ArrayList<>();



    public List<phieuMuon> selectBySql() {
        ResultSet rs = null;
        try {
            String sql = "select *from phieumuon where Enable = 1";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuMuon pm = new phieuMuon();
                    pm.setMaPM(rs.getString(1));
                    pm.setMaND(rs.getString(2));
                    pm.setNgayDenHan(rs.getString(3));
                    pm.setNgayMuon(rs.getString(4));
                    list.add(pm);
                }
            } finally {
//                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<phieuMuon> selectBySqlXoa() {
        ResultSet rs = null;
        try {
            String sql = "select *from phieumuon where Enable = 0";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuMuon pm = new phieuMuon();
                    pm.setMaPM(rs.getString(1));
                    pm.setMaND(rs.getString(2));
                    pm.setNgayDenHan(rs.getString(3));
                    pm.setNgayMuon(rs.getString(4));
                    listXoa.add(pm);
                }
            } finally {
//                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return listXoa;
    }

    public List<phieuMuon> selectByMaTk(String maTk) {
        ResultSet rs = null;
        try {
            String sql = "EXEC dbo.GetPhieuMuonByMaTK @MaTK = " + maTk;
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuMuon pm = new phieuMuon();
                    pm.setMaPM(rs.getString(1));
                    pm.setMaND(rs.getString(2));
                    pm.setNgayDenHan(rs.getString(3));
                    pm.setNgayMuon(rs.getString(4));
                    list.add(pm);
                }
            } finally {
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int them(phieuMuon pm) {
        int a = 0;
        try {

            String sql = "insert into PhieuMuon(MaPhieuMuon,MaND,ngayMuon,NgayDenHan,Enable) values"
                    + " (?, ?,?,?,?)";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            System.out.println(pm.getMaPM());
            sttm.setString(1, pm.getMaPM());
            sttm.setString(2, pm.getMaND());
            sttm.setString(3, dateFormart.formatDateSQL(pm.getNgayMuon()));
            sttm.setString(4, dateFormart.formatDateSQL(pm.getNgayDenHan()));
            sttm.setInt(5, 1);
            sttm.executeUpdate();
//            System.out.println(sql);
            a = 1;
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());

        }
        list.add(pm);
        System.out.println(a);
        return a;
    }

//    public void Sua(phieuMuon pm) {
//        try {
//
//            String sql = "insert into PhieuMuon(MaPhieuMuon,MaND) values"
//                    + " (?, ?)";
//            Connection conn = layKetNoi();
//            PreparedStatement sttm = conn.prepareStatement(sql);
//            sttm.setString(1, pm.getMaPM());
//            sttm.setString(2, pm.getMaND());
//        } catch (Exception e) {
//            System.out.println("Loi!" + e.toString());
//        }
//        list.add(pm);
//
//    }
    public boolean del(String madel) {
        boolean check = true;
        try {
            String sql = "update PhieuMuon set enable= ?  where MaPhieuMuon like ?";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setInt(1, 0);
            sttm.setString(2, madel);
            if (sttm.executeUpdate() > 0) {

//                System.out.println("Xoa thanh cong!");
                Iterator<phieuMuon> iterator = list.iterator();
                while (iterator.hasNext()) {
                    phieuMuon pmd = iterator.next();
                    if (pmd.getMaPM().equalsIgnoreCase(madel)) {
                        iterator.remove();
                    }
                }

            }
        } catch (Exception e) {
            check = false;
        }

        return check;
    }

    public boolean reStore(String madel) {
        boolean check = true;
        try {
            String sql = "update PhieuMuon set PhieuMuon.Enable = ?  where MaPhieuMuon = ?";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setInt(1, 1);
            sttm.setString(2, madel);
            if (sttm.executeUpdate() > 0) {

//                System.out.println("Xoa thanh cong!");
                Iterator<phieuMuon> iterator = list.iterator();
                while (iterator.hasNext()) {
                    phieuMuon pmd = iterator.next();
                    if (pmd.getMaPM().equalsIgnoreCase(madel)) {
                        iterator.remove();
                    }
                }

            }
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        }

        return check;
    }

    public int update(String ngayMuon, String ngayHan,String maPM) {
        int a = 0;
        try {
            String sql = "update PhieuMuon set ngayMuon=?, ngayDenHan=?"
                    + " where MaPhieuMuon like ?";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, ngayMuon);
            sttm.setString(2, ngayHan);
            sttm.setString(3, maPM);

            sttm.executeUpdate();
            a = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    public String tinhNgay(String date) {
        ResultSet rs = null;
        String dateSauAdd = null;
        try {
            String sql = "EXEC Add20DaysToDate '" + date + "'";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    try {
                        dateSauAdd = formatDate(rs.getString(1));
                        return dateSauAdd;
                    } catch (ParseException ex) {
                    }
                }
            } finally {
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
