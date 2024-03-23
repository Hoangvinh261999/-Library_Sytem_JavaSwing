package com.mylibsys.libsystem.dao;


import com.mylibsys.libsystem.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list=new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i=0; i<cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

public List<Object[]> getTopSach(){
        String sql = "{CALL TopSach}";
        String[] cols = {"MaSach","TenSach","TacGia", "NhaXB","TheLoai","SoLuong","DonGia","ViTri","MoTa","NamXB","LanXB","SoTrang","PhieuMuono"};
        return this.getListOfArray(sql, cols);
    }
 public List<Object[]> getSoSachMuon(){
        String sql = "{CALL SachDuocMuon}";
        String[] cols = {"MaPhieuMuonChiTiet","MaPhieuMuon", "MaSach","SoLuong","TinhTrang","SachDaDuocMuon"};
        return this.getListOfArray(sql, cols);
    }
         public List<Object[]> getSoSachMat(){
        String sql = "{CALL SachMat}";
        String[] cols = {"MaPhieuTra","MaPhieuMuonChiTiet", "NgayTra","TienPhat","GhiChu","SachMat"};
        return this.getListOfArray(sql, cols);
    }
    

}

