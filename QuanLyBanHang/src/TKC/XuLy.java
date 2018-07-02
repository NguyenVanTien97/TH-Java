/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TKC;

import DTO.NhanVien_DTO;
import DTO.ChatLieu_DTO;
import DTO.HDBan_DTO;
import DAL.KhachDAL;
import DAL.ChatLieuDAL;
import DAL.HDBanDAL;
import DAL.HangDAL;
import DAL.NhanVienDAL;
import DAL.ChiTietHDBanDAL;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author USER
 */
public class XuLy {
    public static ArrayList<ChatLieu_DTO> ChatLieuArray(){
        return ChatLieuDAL.getALL();
    }
    public static DefaultTableModel ChatLieuModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Chất Liệu");
        model.addColumn("Tên Chất Liệu");
        try{
            for(int i = 0; i < ChatLieuArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(ChatLieuArray().get(i).getMaChatLieu());
                h.add(ChatLieuArray().get(i).getTenChatLieu());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            return null;
        }
    }
    
    public static int InsertChatLieu(String MaChatLieu,String TenChatLieu){
        return ChatLieuDAL.Insert(MaChatLieu, TenChatLieu);
    }
    
    public static int UpdateChatLieu(String MaChatLieu, String TenChatLieu){
        return ChatLieuDAL.Update(MaChatLieu, TenChatLieu);
    }
    
//    public static int DeleteChatLieu(int selectedRow){
//        if(selectedRow > -1){
//            ChatLieuModel().removeRow(selectedRow);
//            ChatLieuArray().remove(selectedRow);
//        }
//    }
    public static int DeleteChatLieu(String MaChatLieu){
        return ChatLieuDAL.Delete(MaChatLieu);
    }
    
    //FORM NHÂN VIÊN
    
    public static ArrayList<NhanVien_DTO> NhanVienArray(){
        return NhanVienDAL.getAll();
    }
    
    public static DefaultTableModel NhanVienModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Nhân Viên");
        model.addColumn("Tên Nhân Viên");
        model.addColumn("Giới tính");
        model.addColumn("Địa chỉ");
        model.addColumn("Điện thoại");
        model.addColumn("Ngày sinh");
        try{
            for(int i = 0; i < NhanVienArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(NhanVienArray().get(i).getMaNhanVien());
                h.add(NhanVienArray().get(i).getTenNhanVien());
                h.add(NhanVienArray().get(i).getGioiTinh());
                h.add(NhanVienArray().get(i).getDiaChi());
                h.add(NhanVienArray().get(i).getDienThoai());
                h.add(NhanVienArray().get(i).getNgaySinh());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            return null;
        }
    }
    
    public static int InsertNhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        return NhanVienDAL.Insert(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
    }
    
    public static int UpdateNhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        return NhanVienDAL.Update(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
    }
    
    public static int DeleteNhanVien(String MaNhanVien){
        return NhanVienDAL.Delete(MaNhanVien);
    }
    
    //FORM DANH MỤC HÀNG HÓA
    
    public static ArrayList<Hang> HangArray(){
        return Hang.getAll();
    }
    
    public static DefaultTableModel HangModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Hàng");
        model.addColumn("Tên hàng");
        model.addColumn("Mã chất liệu");
        model.addColumn("Số lượng");
        model.addColumn("Đơn giá nhập");
        model.addColumn("Đơn giá bán");
        model.addColumn("Ảnh");
        model.addColumn("Ghi chú");
        try{
            for(int i = 0; i < HangArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(HangArray().get(i).getMaHang());
                h.add(HangArray().get(i).getTenHang());
                h.add(HangArray().get(i).getMaChatLieu());
                h.add(String.valueOf(HangArray().get(i).getSoLuong()));
                h.add(String.valueOf(HangArray().get(i).getDonGiaNhap()));
                h.add(String.valueOf(HangArray().get(i).getDonGiaBan()));
                h.add(HangArray().get(i).getAnh());
                h.add(HangArray().get(i).getGhiChu());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static int InsertHang(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        try{
            return HangDAL.Insert(MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu);
        } catch (Exception e){
            return 0;
        }
    }
    
    public static int UpdateHang(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        try{
            return HangDAL.Update(MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu);
        } catch (Exception e){
            return 0;
        }
    }
    
    public static int DeleteHang(String MaHang){
        try {
            return HangDAL.Delete(MaHang);
        } catch (Exception e) {
            return 0;
        }
    }
    
    //FORM KHÁCH HÀNG
    
    public static ArrayList<Khach> KhachArray(){
        return Khach.getAll();
    }
    
    public static DefaultTableModel KhachModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Khách");
            model.addColumn("Tên khách");
            model.addColumn("Địa chỉ");
            model.addColumn("Điện thoại");
            for(int i = 0; i < KhachArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(KhachArray().get(i).getMaKhach());
                h.add(KhachArray().get(i).getTenKhach());
                h.add(KhachArray().get(i).getDiaChi());
                h.add(KhachArray().get(i).getDienThoai());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static int InsertKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return KhachDAL.Insert(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int UpdateKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return KhachDAL.Update(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int DeleteKhach(String MaKhach){
        return KhachDAL.Delete(MaKhach);
    }
    
    //FORM HÓA ĐƠN BÁN
    
    public static ArrayList<HDBan_DTO> HDBanArray(){
        return HDBanDAL.getAll();
    }
    
    public static DefaultTableModel HDBanModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Hàng");
            model.addColumn("Tên hàng");
            model.addColumn("Số lượng");
            model.addColumn("Đơn giá");
            model.addColumn("Giảm giá");
            model.addColumn("Thành tiền");
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
//    public static void RowHDBan(String MaHang,String TenHang,String SoLuong,String DonGia,String GiamGia, String ThanhTien){
//        Vector<String> h = new Vector<>();
//        h.add(MaHang);
//        h.add(TenHang);
//        h.add(SoLuong);
//        h.add(DonGia);
//        h.add(GiamGia);
//        h.add(ThanhTien);
//        HDBanModel().addRow(h);
//    }
    
    
    public static String TenNVHDBan(String MaNhanVien){
        return NhanVienDAL.TenNhanVien(MaNhanVien);
    }
    
    public static String TenKhachHDBan(String MaKhach){
        return KhachDAL.TenKhach(MaKhach);
    }
    
    public static String DTKhachHDBan(String MaKhach){
        return KhachDAL.DienThoai(MaKhach);
    }
    
    public static String DCKhachHDBan(String MaKhach){
        return KhachDAL.DiaChi(MaKhach);
    }
    
    public static String TenHangHDBan(String MaHang){
        return HangDAL.TenHang(MaHang);
    }
    
    public static String DonGiaHDBan(String MaHang){
        return HangDAL.DonGia(MaHang);
    }
    
    public static int InsertHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HDBanDAL.Insert(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int UpdateHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HDBanDAL.Update(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int DeleteHDBan(String MaHDBan){
        return HDBanDAL.Delete(MaHDBan);
    }
    
    public static int InsertChiTietHDBan(String MaHDBan, String MaHang, float SoLuong,float DonGia,float GiamGia,float ThanhTien){
        return ChiTietHDBanDAL.Insert(MaHDBan, MaHang, SoLuong, DonGia, GiamGia, ThanhTien);
    }
    
    //FORM TÌM HÓA ĐƠN
    
    public static DefaultTableModel TimHDBanModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã HĐB");
            model.addColumn("Mã nhân viên");
            model.addColumn("Ngày bán");
            model.addColumn("Tên khách");
            model.addColumn("Tổng tiền");
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static ArrayList<HDBan_DTO> FindHD(String MaHoaDon,String MaNhanVien,String MaKhachHang){
        return HDBanDAL.findHD(MaHoaDon, MaNhanVien, MaHoaDon);
    }

    public static TableModel ChatLieu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Hang {

        private static ArrayList<Hang> getAll() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Hang() {
        }

        private String getMaHang() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getTenHang() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getMaChatLieu() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Object getSoLuong() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Object getDonGiaNhap() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Object getDonGiaBan() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getGhiChu() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getAnh() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Khach {

        private static ArrayList<Khach> getAll() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Khach() {
        }

        private String getMaKhach() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getTenKhach() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getDiaChi() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getDienThoai() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
