/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.entity;
import static com.mylibsys.libsystem.utils.dateFormart.formatDate;

/**
 *
 * @author kuteb
 */
public class phieuTra {
    String maPhieuTra;
    String maPmct;
    String ngayTra;
    double tienPhat;
    String ghiChu;

    public phieuTra() {
    }

    public phieuTra(String maPhieuTra, String maPmct, String ngayTra, double tienPhat, String ghiChu) {
        this.maPhieuTra = maPhieuTra;
        this.maPmct = maPmct;
        this.ngayTra = ngayTra;
        this.tienPhat = tienPhat;
        this.ghiChu = ghiChu;
    }

    public String getMaPhieuTra() {
        return maPhieuTra;
    }

    public void setMaPhieuTra(String maPhieuTra) {
        this.maPhieuTra = maPhieuTra;
    }

    public String getMaPmct() {
        return maPmct;
    }

    public void setMaPmct(String maPmct) {
        this.maPmct = maPmct;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        try {
            this.ngayTra = formatDate(ngayTra);
        } catch (Exception e) {
        }
    }



    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }


   
    
}
