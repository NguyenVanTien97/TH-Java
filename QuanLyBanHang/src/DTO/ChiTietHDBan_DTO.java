/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author USER
 */
public class ChiTietHDBan_DTO {
    private String MaHDBan;
    private String MaHang;
    private float SoLuong;
    private float DonGia;
    private float GiamGia;
    private float ThanhTien;
    
    public ChiTietHDBan_DTO(String MaHDBan, String MaHang, Integer SoLuong, Integer DonGia, Integer GiamGia, Integer ThanhTien) {
        this.MaHDBan = MaHDBan;
        this.MaHang = MaHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.GiamGia = GiamGia;
        this.ThanhTien = ThanhTien;
    }
    
    public String getMaHDBan() {
        return MaHDBan;
    }

    /**
     * @param MaHDBan the MaHDBan to set
     */
    public void setMaHDBan(String MaHDBan) {
        this.MaHDBan = MaHDBan;
    }

    /**
     * @return the MaHang
     */
    public String getMaHang() {
        return MaHang;
    }

    /**
     * @param MaHang the MaHang to set
     */
    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    /**
     * @return the SoLuong
     */
    public float getSoLuong() {
        return SoLuong;
    }

    /**
     * @param SoLuong the SoLuong to set
     */
    public void setSoLuong(float SoLuong) {
        this.SoLuong = SoLuong;
    }

    /**
     * @return the DonGia
     */
    public float getDonGia() {
        return DonGia;
    }

    /**
     * @param DonGia the DonGia to set
     */
    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    /**
     * @return the GiamGia
     */
    public float getGiamGia() {
        return GiamGia;
    }

    /**
     * @param GiamGia the GiamGia to set
     */
    public void setGiamGia(float GiamGia) {
        this.GiamGia = GiamGia;
    }

    /**
     * @return the ThanhTien
     */
    public float getThanhTien() {
        return ThanhTien;
    }

    /**
     * @param ThanhTien the ThanhTien to set
     */
    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
}
