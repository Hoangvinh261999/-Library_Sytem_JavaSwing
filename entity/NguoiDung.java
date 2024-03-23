/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.entity;

/**
 *
 * @author HP
 */
public class NguoiDung {
    String maND;
    String tenND;
    String sdt;
    String email;
    String diaChi;
    String maTK;
    String ngayLapTk;

    public NguoiDung() {
    }

    public NguoiDung(String maND, String tenND, String sdt, String email, String diaChi, String maTK, String ngayLapTk) {
        this.maND = maND;
        this.tenND = tenND;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.maTK = maTK;
        this.ngayLapTk = ngayLapTk;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getNgayLapTk() {
        return ngayLapTk;
    }

    public void setNgayLapTk(String ngayLapTk) {
        this.ngayLapTk = ngayLapTk;
    }

    

    
    
    
    
}
