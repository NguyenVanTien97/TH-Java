/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVien_DTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class NhanVienDAL {
    public static ArrayList<NhanVien_DTO> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from NhanVien";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<NhanVien_DTO> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaNhanVien = rs.getString("MaNhanVien");
                    String TenNhanVien = rs.getString("TenNhanVien");
                    String GioiTinh = rs.getString("GioiTinh");
                    String DiaChi = rs.getString("DiaChi");
                    String DienThoai = rs.getString("DienThoai");
                    String NgaySinh = rs.getString("NgaySinh");
                    NhanVien_DTO NV= new NhanVien_DTO(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
                    ds.add(NV);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static String TenNhanVien(String MaNhanVien){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TenNhanVien from NhanVien where MaNhanVien='"+ MaNhanVien +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("TenNhanVien");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
    
    public static int Insert(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into NhanVien(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh) values ('"+ MaNhanVien +"','"+ TenNhanVien +"','"+ GioiTinh +"','"+DiaChi+"','"+ DienThoai +"','"+NgaySinh+"')";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Update(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update NhanVien set TenNhanVien = '"+ TenNhanVien +"', GioiTinh = '"+ GioiTinh +"',DiaChi = '"+ DiaChi +"',DienThoai = '"+ DienThoai +"',NgaySinh = '"+ NgaySinh +"' where MaNhanVien = '"+ MaNhanVien +"'";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Delete(String MaNhanVien){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from NhanVien where MaNhanVien = '"+MaNhanVien+"'";
                int rs = stmt.executeUpdate(sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
}
