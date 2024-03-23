/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.entity;

import static com.mylibsys.libsystem.utils.dateFormart.formatDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kuteb
 */
public class phieuMuonChiTiet {

    String maPmct;
    String maPM;
    String maSach;
    int soLuong;
    String tinhTrang;

    public phieuMuonChiTiet() {
    }

    public phieuMuonChiTiet(String maPmct, String maPM, String maSach, int soLuong, String tinhTrang) {
        this.maPmct = maPmct;
        this.maPM = maPM;
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public String getMaPmct() {
        return maPmct;
    }

    public void setMaPmct(String maPmct) {
        this.maPmct = maPmct;
    }

    public String getMaPM() {
        return maPM;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }



}
