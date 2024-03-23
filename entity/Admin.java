/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.entity;


public class Admin {

    String maAD;
    String tenAD;
    String sdt;
    String email;
    String diaChi;
    String maTK;

    public Admin() {
    }

    public Admin(String maAD, String tenAD, String sdt, String email, String diaChi, String maTK) {
        this.maAD = maAD;
        this.tenAD = tenAD;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.maTK = maTK;
    }

    public String getMaAD() {
        return maAD;
    }

    public void setMaAD(String maND) {
        this.maAD = maAD;
    }

    public String getTenAD() {
        return tenAD;
    }

    public void setTenAD(String tenND) {
        this.tenAD = tenAD;
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

    
    
    
    
}
