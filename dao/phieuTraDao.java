/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.dao;

import com.mylibsys.libsystem.entity.phieuTra;
import com.mylibsys.libsystem.utils.dateFormart;
import static com.mylibsys.libsystem.utils.sqlSeverConnect.layKetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class phieuTraDao  {

    List<phieuTra> list = new ArrayList<>();
    List<phieuTra> listXoa = new ArrayList<>();



    public List<phieuTra> selectAllBySql() {
        ResultSet rs = null;
        try {
            String sql = "select *from phieuTra where Enable =1";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuTra pt = new phieuTra();
                    pt.setMaPhieuTra(rs.getString(1));
                    pt.setMaPmct(rs.getString(2));
                    pt.setNgayTra(rs.getString(3));
                    pt.setTienPhat(Double.parseDouble(rs.getString(4)));
                    pt.setGhiChu(rs.getString(5));
                    list.add(pt);
                }
            } finally {
//                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
            ex.printStackTrace();
        }
        return list;
    }

    public List<phieuTra> selectAllXoa() {
        ResultSet rs = null;
        try {
            String sql = "select *from phieuTra where Enable =0";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuTra pt = new phieuTra();
                    pt.setMaPhieuTra(rs.getString(1));
                    pt.setMaPmct(rs.getString(2));
                    pt.setNgayTra(rs.getString(3));
                    pt.setTienPhat(Double.parseDouble(rs.getString(4)));
                    pt.setGhiChu(rs.getString(5));
                    listXoa.add(pt);
                }
            } finally {
//                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
            ex.printStackTrace();
        }
        return listXoa;
    }

    public List<phieuTra> selectAllByND(String matk) {
        ResultSet rs = null;
        try {
            String sql = "EXEC dbo.GetPhieuTraByMaTK @MaTK = " + matk;
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuTra pt = new phieuTra();
                    pt.setMaPhieuTra(rs.getString(1));
                    pt.setMaPmct(rs.getString(2));
                    pt.setNgayTra(rs.getString(3));
                    pt.setTienPhat(Double.parseDouble(rs.getString(4)));
                    pt.setGhiChu(rs.getString(5));
                    list.add(pt);
                }
            } finally {
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public int soNgayMuon(String ma, String ngayTra) {
        int soNgayMuon = 0;
        ResultSet rs = null;
        try {
            String sql = "EXEC Pt_day @pmct_MaPMCT =N'" + ma + "'" + ",@pt_NgayTra='" + ngayTra + "'";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    soNgayMuon = Integer.parseInt(rs.getString(1));
                    return soNgayMuon;
                }
            } finally {
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
//        System.out.println(soNgayMuon);
        return soNgayMuon;
    }

    public int soLuong(String maPMCT) {
        int a = 0;
        ResultSet rs = null;
        try {
            String sql = "Select soLuong from PhieuMuonChiTiet where maPhieuMuonChiTiet like '" + maPMCT + "'";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    a = Integer.parseInt(rs.getString(1));
                    return a;
                }
            } finally {
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return a;
    }

    public int them(phieuTra pt) {
        int a = 0;

        try {

            String sql = "insert into PhieuTra(MaPhieuTra,MaPhieuMuonChiTiet,NgayTra,TienPhat,GhiChu,Enable) values"
                    + " (?,?,?,?,?,?)";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, pt.getMaPhieuTra());
            sttm.setString(2, pt.getMaPmct());
            sttm.setString(3, dateFormart.formatDateSQL(pt.getNgayTra()));
            sttm.setDouble(4, pt.getTienPhat());
            sttm.setString(5, pt.getGhiChu());
            sttm.setInt(6, 1);
            sttm.executeUpdate();
            a = 1;
        } catch (Exception e) {
            e.printStackTrace();
            a = 0;

        }
        list.add(pt);
        return a;
    }

    public int del(String madel) {
        int a = 0;
        try {
            String sql = "update PhieuTra set enable = 0 where MaPhieuTra like ?";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, madel);
            sttm.executeUpdate();
            a = 1;
        } catch (SQLException e) {
            a = 0;
        }
        Iterator<phieuTra> iterator = list.iterator();
        while (iterator.hasNext()) {
            phieuTra pmd = iterator.next();
            if (pmd.getMaPhieuTra().equalsIgnoreCase(madel)) {
                iterator.remove();
                a = 1;
            }
        }
        return a;
    }

    public int restore(String madel) {
        int a = 0;
        try {
            String sql = "update PhieuTra set enable = 1 where MaPhieuTra like ?";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, madel);
            sttm.executeUpdate();
            a = 1;
        } catch (SQLException e) {
            a = 0;
        }
        Iterator<phieuTra> iterator = list.iterator();
        while (iterator.hasNext()) {
            phieuTra pmd = iterator.next();
            if (pmd.getMaPhieuTra().equalsIgnoreCase(madel)) {
                iterator.remove();
                a = 1;
            }
        }
        return a;
    }

    public int update(String maPT, String ngayTra, double tienPhat, String ghiChu) {
        int a = 0;
        try {
            String sql = "update PhieuTra set NgayTra=?,TienPhat=?,GhiChu=?  where MaPhieuTra like ?";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, ngayTra);
            sttm.setDouble(2, tienPhat);
            sttm.setString(3, ghiChu);
            sttm.setString(4, maPT);
            sttm.executeUpdate();
            a = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    public boolean setSoLuongSachTang(String maPhieuMCT) {
        ResultSet rs = null;
        try {
            String sql = "EXEC tangSLSachPTRA '" + maPhieuMCT + "'";
            Statement stm = layKetNoi().createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
//public boolean setSoLuongSachGiam(String maPhieuMCT){
//        ResultSet rs = null;
//        try {
//            String sql = "EXEC giamSoLuongSach '" + maPhieuMCT + "'";
//            Statement stm = layKetNoi().createStatement();
//            stm.executeUpdate(sql);       
//        } catch (SQLException ex) {
//            return false;
//        }
//return true;
//
//}

    public String getTenNguoiDungByMaPhieuTra(String maPT) {
        String tenNguoiDung = null;
        try {
            String sql = "EXEC GetTenNguoiDungByMaPhieuTra ?";
            PreparedStatement statement = layKetNoi().prepareStatement(sql);
            statement.setString(1, maPT);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                tenNguoiDung = result.getString("TenND");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tenNguoiDung;
    }

    public String getPMCTchuaPT(String Sdt) {
        String ma = null;
        try {
            String sql = "EXEC GetPmctNotInPTBySDT @nd_sodienthoai= ?";
            PreparedStatement statement = layKetNoi().prepareStatement(sql);
            statement.setString(1, Sdt);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                ma = result.getString(1);
                return ma;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<String> getListPMCTchuaPT(String Sdt) {
        List<String> ma = new ArrayList<>();
        try {
            String sql = "EXEC GetPmctNotInPTBySDT @nd_sodienthoai= ?";
            PreparedStatement statement = layKetNoi().prepareStatement(sql);
            statement.setString(1, Sdt);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                ma.add(result.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ma;
    }

    public String getBookNameByPmcT(String Sdt) {
        try {
            String sql = "EXEC GetBookNameByMaPMCT @maPMCT=?";
            PreparedStatement statement = layKetNoi().prepareStatement(sql);
            statement.setString(1, Sdt);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String ma = result.getString(1);
                System.out.println(ma);
                return ma;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String GetNameFromMaPT(String ma) {
        try {
        } catch (Exception e) {
        }
        return null;
    }
}
