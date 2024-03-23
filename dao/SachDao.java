/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.dao;

import com.mylibsys.libsystem.entity.Sach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static com.mylibsys.libsystem.utils.sqlSeverConnect.layKetNoi;

/**
 *
 * @author huydo
 */
public class SachDao {

    Connection conn = null;
    PreparedStatement sttm = null;

    public List<Sach> getAllBook() {
        List<Sach> list = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from Sach where TrangThai = '1' ";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMaSach(rs.getString(1));
                sach.setTenSach(rs.getString(2));
                sach.setTacGia(rs.getString(3));
                sach.setNhaXB(rs.getString(4));
                sach.setTheLoai(rs.getString(5));
                sach.setSoLuong(rs.getInt(6));
                sach.setDonGia(rs.getDouble(7));
                sach.setViTri(rs.getString(8));
                sach.setMoTa(rs.getString(9));
                sach.setHinh(rs.getString(10));
                sach.setNamXB(rs.getInt(11));
                sach.setLanXB(rs.getInt(12));
                sach.setSoTrang(rs.getInt(13));
                list.add(sach);
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return list;
    }

    public int add(Sach sach) {
        try {
            String sql = "insert into Sach (MaSach, TenSach, TacGia, NhaXB, TheLoai, SoLuong, DonGia, ViTri, MoTa, hinh, NamXB, LanXB, SoTrang, TrangThai) values"
                    + " (?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?,'true')";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, sach.getMaSach());
            sttm.setString(2, sach.getTenSach());
            sttm.setString(3, sach.getTacGia());
            sttm.setString(4, sach.getNhaXB());
            sttm.setString(5, sach.getTheLoai());
            sttm.setInt(6, sach.getSoLuong());
            sttm.setDouble(7, sach.getDonGia());
            sttm.setString(8, sach.getViTri());
            sttm.setString(9, sach.getMoTa());
            sttm.setString(10, sach.getHinh());
            sttm.setInt(11, sach.getNamXB());
            sttm.setInt(12, sach.getLanXB());
            sttm.setInt(13, sach.getSoTrang());
            if (sttm.executeUpdate() > 0) {
                System.out.println("Them thanh cong!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return -1;
    }

    public int del(String maSach) {
        try {
            String sql = "update Sach set TrangThai = 'False' where MaSach = ?";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, maSach);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Xoa thanh cong!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return -1;
    }

    public int update(Sach sach) {
        try {
            String sql = "update Sach set  TenSach=?, TacGia=?, NhaXB=?, TheLoai=?, SoLuong=?,DonGia=?,ViTri=?,MoTa=?,Hinh=?,NamXB=?, LanXB=?, SoTrang=?"
                    + " where MaSach = ? and TrangThai = 'true' ";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(13, sach.getMaSach());
            sttm.setString(1, sach.getTenSach());
            sttm.setString(2, sach.getTacGia());
            sttm.setString(3, sach.getNhaXB());
            sttm.setString(4, sach.getTheLoai());
            sttm.setInt(5, sach.getSoLuong());
            sttm.setDouble(6, sach.getDonGia());
            sttm.setString(7, sach.getViTri());
            sttm.setString(8, sach.getMoTa());
            sttm.setString(9, sach.getHinh());
            sttm.setInt(10, sach.getNamXB());
            sttm.setInt(11, sach.getLanXB());
            sttm.setInt(12, sach.getSoTrang());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Sua thanh cong!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return -1;
    }

    public Sach findbyMa(String maSach) {
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from Sach where MaSach = '" + maSach + " ' ";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMaSach(rs.getString(1));
                sach.setTenSach(rs.getString(2));
                sach.setTacGia(rs.getString(3));
                sach.setNhaXB(rs.getString(4));
                sach.setTheLoai(rs.getString(5));
                sach.setSoLuong(rs.getInt(6));
                sach.setDonGia(rs.getDouble(7));
                sach.setViTri(rs.getString(8));
                sach.setMoTa(rs.getString(9));
                sach.setHinh(rs.getString(10));
                sach.setNamXB(rs.getInt(11));
                sach.setLanXB(rs.getInt(12));
                sach.setSoTrang(rs.getInt(13));
                return sach;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return null;
    }

//    public Sach findbyName(String tenSach){
//        Statement sttm = null;
//         ResultSet rs = null;
//       try {
//            String sSQL = "select * from Sach where TenSach like N'%" + tenSach + "%'";
//            conn = DatabaseHelper.getDBConnect();
//            sttm = conn.createStatement();
//            rs = sttm.executeQuery(sSQL);
//            while (rs.next()) {
//                Sach sach = new Sach();
//                sach.setMaSach(rs.getString(1));
//                sach.setTenSach(rs.getString(2));
//                sach.setTacGia(rs.getString(3));
//                sach.setNhaXB(rs.getString( 4));
//                sach.setTheLoai(rs.getString(5));
//                sach.setSoLuong(rs.getInt(6));
//                sach.setDonGia(rs.getDouble(7));
//                sach.setViTri(rs.getString(8));
//                sach.setMoTa(rs.getString(9));
//                sach.setHinh(rs.getString(10));
//                return sach;
//            }
//        } catch (Exception e) {
//            System.out.println("Loi!" + e.toString());
//        }
//        return null;
//    }
    public List<Sach> ListByFind(String tenSach, String theloai, String tacgia) {
        List<Sach> list = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from Sach where TenSach like N'%" + tenSach + "%'" + "and TheLoai like N'%" + theloai + "%'" + "and TacGia like N'%" + tacgia + "%' "
                    + "and TrangThai = 'true'";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMaSach(rs.getString(1));
                sach.setTenSach(rs.getString(2));
                sach.setTacGia(rs.getString(3));
                sach.setNhaXB(rs.getString(4));
                sach.setTheLoai(rs.getString(5));
                sach.setSoLuong(rs.getInt(6));
                sach.setDonGia(rs.getDouble(7));
                sach.setViTri(rs.getString(8));
                sach.setMoTa(rs.getString(9));
                sach.setHinh(rs.getString(10));
                sach.setNamXB(rs.getInt(11));
                sach.setLanXB(rs.getInt(12));
                sach.setSoTrang(rs.getInt(13));
                list.add(sach);
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return list;
    }

    public int Restore(String maSach) {
        try {
            String sql = "update Sach set TrangThai = 'true' where MaSach = ?";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, maSach);

            if (sttm.executeUpdate() > 0) {
                System.out.println("khoi phuc thanh cong!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return -1;
    }

    public List<Sach> ListByFindRecycleBin(String tenSach, String theloai, String tacgia) {
        List<Sach> list = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from Sach where TenSach like N'%" + tenSach + "%'" + "and TheLoai like N'%" + theloai + "%'" + "and TacGia like N'%" + tacgia + "%' "
                    + "and TrangThai = 'false'";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMaSach(rs.getString(1));
                sach.setTenSach(rs.getString(2));
                sach.setTacGia(rs.getString(3));
                sach.setNhaXB(rs.getString(4));
                sach.setTheLoai(rs.getString(5));
                sach.setSoLuong(rs.getInt(6));
                sach.setDonGia(rs.getDouble(7));
                sach.setViTri(rs.getString(8));
                sach.setMoTa(rs.getString(9));
                sach.setHinh(rs.getString(10));
                sach.setNamXB(rs.getInt(11));
                sach.setLanXB(rs.getInt(12));
                sach.setSoTrang(rs.getInt(13));
                list.add(sach);
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return list;
    }

    public List<Sach> getAllBookRecycleBin() {
        List<Sach> list = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from Sach where TrangThai = '0' ";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMaSach(rs.getString(1));
                sach.setTenSach(rs.getString(2));
                sach.setTacGia(rs.getString(3));
                sach.setNhaXB(rs.getString(4));
                sach.setTheLoai(rs.getString(5));
                sach.setSoLuong(rs.getInt(6));
                sach.setDonGia(rs.getDouble(7));
                sach.setViTri(rs.getString(8));
                sach.setMoTa(rs.getString(9));
                sach.setHinh(rs.getString(10));
                sach.setNamXB(rs.getInt(11));
                sach.setLanXB(rs.getInt(12));
                sach.setSoTrang(rs.getInt(13));

                list.add(sach);
            }
        } catch (Exception e) {
            System.out.println("Loi!" + e.toString());
        }
        return list;
    }
}
