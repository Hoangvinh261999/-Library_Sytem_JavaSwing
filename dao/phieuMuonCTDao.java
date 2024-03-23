/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.dao;

import com.mylibsys.libsystem.entity.phieuMuonChiTiet;
import static com.mylibsys.libsystem.utils.sqlSeverConnect.layKetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kuteb
 */
public class phieuMuonCTDao {

    public List<phieuMuonChiTiet> list = new ArrayList<>();
    public List<phieuMuonChiTiet> listXoa = new ArrayList<>();

    public List<phieuMuonChiTiet> selectBySql() {
        ResultSet rs = null;
        try {
            String sql = "select *from phieumuonchitiet where Enable=1";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuMuonChiTiet pmct = new phieuMuonChiTiet();
                    pmct.setMaPmct(rs.getString(1));
                    pmct.setMaPM(rs.getString(2));
                    pmct.setMaSach(rs.getString(3));
                    pmct.setSoLuong(rs.getInt(4));
                    pmct.setTinhTrang(rs.getString(5));
                    list.add(pmct);
                }
            } finally {

            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<phieuMuonChiTiet> selectBySqlXoa() {
        ResultSet rs = null;
        try {
            String sql = "select *from phieumuonchitiet where Enable=0";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuMuonChiTiet pmct = new phieuMuonChiTiet();
                    pmct.setMaPmct(rs.getString(1));
                    pmct.setMaPM(rs.getString(2));
                    pmct.setMaSach(rs.getString(3));
                    pmct.setSoLuong(rs.getInt(4));
                    pmct.setTinhTrang(rs.getString(5));
                    listXoa.add(pmct);
                }
            } finally {

            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return listXoa;
    }

    public List<phieuMuonChiTiet> selectByMaTk(String maTk) {
        ResultSet rs = null;
        try {
            String sql = "EXEC dbo.GetPhieuMuonChiTietByMaTK @MaTK =" + maTk;
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuMuonChiTiet pmct = new phieuMuonChiTiet();
                    pmct.setMaPmct(rs.getString(1));
                    pmct.setMaPM(rs.getString(2));
                    pmct.setMaSach(rs.getString(3));
                    pmct.setSoLuong(rs.getInt(4));
                    pmct.setTinhTrang(rs.getString(5));
                    list.add(pmct);
                }
            } finally {

            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<phieuMuonChiTiet> selectBySqlByMa(String ma) {
        ResultSet rs = null;
        try {
            String sql = "select *from phieumuonchitiet where maPhieuMuon='" + ma + "'";
            Statement stm = layKetNoi().createStatement();
            try {
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    phieuMuonChiTiet pmct = new phieuMuonChiTiet();
                    pmct.setMaPmct(rs.getString(1));
                    pmct.setMaPM(rs.getString(2));
                    pmct.setMaSach(rs.getString(3));
                    pmct.setSoLuong(rs.getInt(4));
                    pmct.setTinhTrang(rs.getString(5));
                    list.add(pmct);
                }
            } finally {

            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public boolean them(phieuMuonChiTiet pmct) {
        boolean check = true;
        try {
            String sql = "insert into PhieuMuonChiTiet(MaPhieuMuonChiTiet,MaPhieuMuon,MaSach,soLuong,tinhTrang,Enable) values"
                    + " (?,?,?,?,?,?)";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, pmct.getMaPmct());
            sttm.setString(2, pmct.getMaPM());
            sttm.setString(3, pmct.getMaSach());
            sttm.setInt(4, pmct.getSoLuong());
            sttm.setString(5, pmct.getTinhTrang());
            sttm.setInt(6, 1);
            sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        }
        System.out.println("check ben themdao" + check);
        list.add(pmct);
        return check;
    }

    public boolean update(String maPMCT, int soLuong, String tinhTrang, String maSach) {
        try {
            String sql = "update PhieuMuonChiTiet set maSach=?, soLuong=?, tinhTrang=? where MaPhieuMuonChitiet like ?";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, maSach);
            sttm.setInt(2, soLuong);
            sttm.setString(3, tinhTrang);
            sttm.setString(4, maPMCT);
            if (sttm.executeLargeUpdate() > 0) {
                System.out.println("Sua thanh cong!");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean xoa(String maPMCT) {
        try {
            String sql = "update PhieuMuonChiTiet set PhieuMuonChiTiet.enable=0 where MaPhieuMuonChitiet like ?";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, maPMCT);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Sua thanh cong!");
            }
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("Không thể tạo phiếu khi mã phiếu mượn không tồn tại !");
            return false;
        }
        return true;
    }

    public boolean restore(String maPMCT) {
        try {
            String sql = "update PhieuMuonChiTiet set PhieuMuonChiTiet.enable=1 where MaPhieuMuonChitiet like ?";
            Connection conn = layKetNoi();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, maPMCT);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Sua thanh cong!");
            }
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("Không thể tạo phiếu khi mã phiếu mượn không tồn tại !");
            return false;
        }
        return true;
    }

    public boolean setSoLuongSachTang(String maSach) {
        ResultSet rs = null;
        try {
            String sql = "EXEC TangSLsachPMCT '" + maSach + "'";
            Statement stm = layKetNoi().createStatement();
            System.out.println(sql);
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean setSoLuongSachGiam(String maSach) {
        ResultSet rs = null;
        try {
            String sql = "EXEC GiamSLsachPMCT '" + maSach + "'";
            Statement stm = layKetNoi().createStatement();
            System.out.println(sql);
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public int geSlSach(String maSach) {
        ResultSet rs = null;
        int a = 0;
        try {
            String sql = "exec getSLSach '" + maSach + "'";
            Statement stm = layKetNoi().createStatement();
//            System.out.println(sql);
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                a = rs.getInt(1);
                return a;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return 0;
    }

    public String gettenNDIn(String maPM) {
        ResultSet rs = null;
        String a = null;
        try {
            String sql = "select nd.TenND  from NguoiDung nd inner join PhieuMuon pm on nd.MaND = pm.MaND where pm.MaPhieuMuon='" + maPM+"'";
            Statement stm = layKetNoi().createStatement();

            rs = stm.executeQuery(sql);
            if (rs.next()) {
                a = rs.getString(1);

            }
        } catch (Exception e) {
        }
        return a;
    }

    public String gettenSach(String maSach) {
        ResultSet rs = null;
        try {
            String sql = "select Sach.TenSach from Sach where sach.MaSach='" + maSach+"'";
            Statement stm = layKetNoi().createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                String a = rs.getString(1);
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<String> getDateIn(String maPM) {
        ResultSet rs = null;
        List<String> Ngay = new ArrayList<>();

        try {
            String sql = "select PhieuMuon.NgayMuon,PhieuMuon.NgayDenHan from PhieuMuon where PhieuMuon.MaPhieuMuon='" + maPM+"'";
            Statement stm = layKetNoi().createStatement();
            rs = stm.executeQuery(sql);
           while (rs.next()) {
                String a = rs.getString(1);
                Ngay.add(a);
                String b = rs.getString(2);
                Ngay.add(b);
            }
        } catch (Exception e) {
        }
        System.out.println("size"+Ngay.size());
        return Ngay;
    }
}
