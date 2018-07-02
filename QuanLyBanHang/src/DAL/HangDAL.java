/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Hang_DTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class HangDAL {
    public static ArrayList<Hang_DTO> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from Hang";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<Hang_DTO> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaHang = rs.getString("MaHang");
                    String TenHang = rs.getString("TenHang");
                    String MaChatLieu = rs.getString("MaChatLieu");
                    float SoLuong = rs.getFloat("SoLuong");
                    float DonGiaNhap = rs.getFloat("DonGiaNhap");
                    float DonGiaBan = rs.getFloat("DonGiaBan");
                    String Anh = rs.getString("Anh");
                    String GhiChu = rs.getString("GhiChu");
                    Hang_DTO mathang = new Hang_DTO(MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu);
                    ds.add(mathang);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static String TenHang(String MaHang){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TenHang from Hang where MaHang='"+ MaHang +"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                    return rs.getString("TenHang");
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
    
    public static String DonGia(String MaHang){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select DonGiaBan from Hang where MaHang='"+ MaHang +"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                    return rs.getString("DonGiaBan");
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
    
    public static int Insert(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into Hang(MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu) values ('"+ MaHang +"',N'"+ TenHang +"','"+ MaChatLieu +"',"+ SoLuong +","+ DonGiaNhap +","+ DonGiaBan +",'"+ Anh +"',N'"+ GhiChu +"')";
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
    
    public static int Update(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update Hang set TenHang = N'" + TenHang + "',MaChatLieu = '" + MaChatLieu + "', SoLuong = "+ SoLuong +",DonGiaNhap = "+ DonGiaNhap +",DonGiaBan = "+ DonGiaBan +", Anh = '" + Anh + "',GhiChu = N'" + GhiChu + "' where MaHang = '"+ MaHang +"'";
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
    
    public static int Delete(String MaHang){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from Hang where MaHang = '"+MaHang+"'";
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
