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
public class Hang_DTO {
    private String MaHang;
    private String TenHang;
    private String MaChatLieu;
    private float SoLuong;
    private float DonGiaNhap;
    private float DonGiaBan;
    private String Anh;
    private String GhiChu;
    public Hang_DTO(String MaHang, String TenHang,String MaChatLieu,float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.MaChatLieu = MaChatLieu;
        this.SoLuong = SoLuong;
        this.DonGiaBan = DonGiaBan;
        this.DonGiaNhap = DonGiaNhap;
        this.Anh = Anh;
        this.GhiChu = GhiChu;
    }
    
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
     * @return the TenHang
     */
    public String getTenHang() {
        return TenHang;
    }

    /**
     * @param TenHang the TenHang to set
     */
    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    /**
     * @return the MaChatLieu
     */
    public String getMaChatLieu() {
        return MaChatLieu;
    }

    /**
     * @param MaChatLieu the MaChatLieu to set
     */
    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
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
     * @return the DonGiaNhap
     */
    public float getDonGiaNhap() {
        return DonGiaNhap;
    }

    /**
     * @param DonGiaNhap the DonGiaNhap to set
     */
    public void setDonGiaNhap(float DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }

    /**
     * @return the DonGiaBan
     */
    public float getDonGiaBan() {
        return DonGiaBan;
    }

    /**
     * @param DonGiaBan the DonGiaBan to set
     */
    public void setDonGiaBan(float DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    /**
     * @return the Anh
     */
    public String getAnh() {
        return Anh;
    }

    /**
     * @param Anh the Anh to set
     */
    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    /**
     * @return the chatLieus
     */
    

    /**
     * @param chatLieus the chatLieus to set
     */
//    public void setChatLieus(HashSet<ChatLieu> chatLieus) {
//        this.chatLieus = chatLieus;
//    }
}

