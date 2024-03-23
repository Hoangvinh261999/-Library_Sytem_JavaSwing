///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package com.mylibsys.libsystem.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mylibsys.libsystem.entity.NguoiDung;
import static com.mylibsys.libsystem.utils.sqlSeverConnect.layKetNoi;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author dao
 */
public class nguoiDungDao {

    Connection conn = null;
    PreparedStatement sttm = null;

    public List<NguoiDung> getAllND() {
        List<NguoiDung> list = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from NguoiDung nd\n"
                    + "inner join TaiKhoan tk on tk.MaTK = nd.MaTK where tk.role = 'user' and nd.Enable = 'true';";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                NguoiDung user = new NguoiDung();
                user.setMaND(rs.getString(1));
                user.setTenND(rs.getString(2));
                user.setSdt(rs.getString(3));
                user.setEmail(rs.getString(4));
                user.setDiaChi(rs.getString(5));
                user.setMaTK(rs.getString(6));
                list.add(user);
            }
        } catch (Exception e) {
            System.out.println("Lỗi !" + e.toString());
        }
        return list;
    }

//    public int add(NguoiDung nd) {
//        try {
//            String sql = "INSERT[NguoiDung] ([MaND], [TenND], [SoDienThoai], [Email], [DiaChi], [TienCoc]) VALUES"
//                    + " (?, ?, ?, ?, ?, ?)";
//            conn = layKetNoi();
//            sttm = conn.prepareStatement(sql);
//            sttm.setString(1, nd.getMaND());
//            sttm.setString(2, nd.getTenND());
//            sttm.setString(3, nd.getSdt());
//            sttm.setString(4, nd.getEmail());
//            sttm.setString(5, nd.getDiaChi());
//
//            if (sttm.executeUpdate() > 0) {
//                System.out.println("Thêm thành công!");
//                return 1;
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi !" + e.toString());
//        }
//        return -1;
//    }
    public int delete(String MaND) {
        try {
            String sql = "update NguoiDung set Enable ='0' where MaND = ?";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, MaND);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Xóa thành công !");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Lỗi roài" + e.toString());
        }
        return -1;
    }

    public int update(NguoiDung nd) {
        try {
            String sql = "update NguoiDung \n"
                    + "set TenND = ? , SoDienThoai= ?, DiaChi= ? "
                    + "from NguoiDung nd\n"
                    + "inner join TaiKhoan tk on tk.MaTK = nd.MaTK where tk.role = 'user' and MaND = ? and nd.Enable = 'true';";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(4, nd.getMaND());
            sttm.setString(1, nd.getTenND());
            sttm.setString(2, nd.getSdt());
            sttm.setString(3, nd.getDiaChi());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Cập nhật thành công !");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Lỗi!" + e.toString());
        }
        return -1;
    }

    public NguoiDung findbyMa(String maND) {
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from NguoiDung where MaND = '" + maND + "'";
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
            System.out.println("Lỗi!" + e.toString());
        }
        return null;
    }

    public NguoiDung findbyEmail(String email) {
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from NguoiDung where Email = '" + email + "'";
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
            System.out.println("Lỗi!" + e.toString());
        }
        return null;
    }

    public List<NguoiDung> ListByName(String tenND, String DiaChi) {
        List<NguoiDung> list = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from NguoiDung nd\n"
                    + "inner join TaiKhoan tk on tk.MaTK = nd.MaTK where tk.role = 'user'\n"
                    + "and TenND like N'%" + tenND + "%'" + "and DiaChi like N'%" + DiaChi + "%'" + "and Enable= 'true'";
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
                list.add(nd);
            }
        } catch (Exception e) {
            System.out.println("Lỗi!" + e.toString());
        }
        return list;
    }

    public int Restore(String MaND) {
        try {
            String sql = "update NguoiDung set Enable ='1' where MaND = ?";
            conn = layKetNoi();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, MaND);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Khôi phục thành công !");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Lỗi roài" + e.toString());
        }
        return -1;
    }

    public List<NguoiDung> ListByNameRecycleBin(String tenND, String DiaChi) {
        List<NguoiDung> list = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from NguoiDung nd\n"
                    + "inner join TaiKhoan tk on tk.MaTK = nd.MaTK where tk.role = 'user'\n"
                    + "and TenND like N'%" + tenND + "%'" + "and DiaChi like N'%" + DiaChi + "%'" + "and Enable= '0'";
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
                list.add(nd);
            }
        } catch (Exception e) {
            System.out.println("Lỗi!" + e.toString());
        }
        return list;
    }

    public List<NguoiDung> getAllNDRecycleBin() {
        List<NguoiDung> list = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from NguoiDung nd\n"
                    + "inner join TaiKhoan tk on tk.MaTK = nd.MaTK where tk.role = 'user' and nd.Enable = '0';";
            conn = layKetNoi();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                NguoiDung user = new NguoiDung();
                user.setMaND(rs.getString(1));
                user.setTenND(rs.getString(2));
                user.setSdt(rs.getString(3));
                user.setEmail(rs.getString(4));
                user.setDiaChi(rs.getString(5));
                user.setMaTK(rs.getString(6));
                list.add(user);
            }
        } catch (Exception e) {
            System.out.println("Lỗi !" + e.toString());
        }
        return list;
    }

}
