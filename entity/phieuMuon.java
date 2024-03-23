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
public class phieuMuon {

    String maPM;
    String maND;
    String ngayMuon;
    String ngayDenHan;

    public phieuMuon() {
    }

    public phieuMuon(String maPM, String maND, String ngayMuon, String ngayDenHan) {
        this.maPM = maPM;
        this.maND = maND;
        this.ngayMuon = ngayMuon;
        this.ngayDenHan = ngayDenHan;
    }

    public String getMaPM() {
        return maPM;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        try {
            this.ngayMuon = formatDate(ngayMuon);
        } catch (Exception e) {
        }

    }

    public String getNgayDenHan() {
        return ngayDenHan;
    }

    public void setNgayDenHan(String ngayDenHan) {
        try {
            this.ngayDenHan = formatDate(ngayDenHan);
        } catch (Exception e) {
        }

    }

}
