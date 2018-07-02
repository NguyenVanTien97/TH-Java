/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChatLieu_DTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ChatLieuDAL {

    public static ArrayList<ChatLieu_DTO> getALL() {
        Connection con = DBConnect.KetNoi();
        if (con != null) {
            try {
                Statement stmt = con.createStatement();
                String sql = "select * from tblChatLieu";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<ChatLieu_DTO> chat = new ArrayList<>();
                while (true) {
                    if (!rs.next()) {
                        break;
                    }
                    String MaChatLieu = rs.getString("MaChatLieu");
                    String TenChatLieu = rs.getString("TenChatLieu");
                    ChatLieu_DTO chatLieu = new ChatLieu_DTO(MaChatLieu, TenChatLieu);
                    chat.add(chatLieu);
                }
                con.close();
                return chat;
            } catch (SQLException ex) {
                System.out.println(ex);
                return null;
            }
        }
        return null;
    }
    public static ArrayList<ChatLieu_DTO> getById(int id) {

        return null;
    }
    public static int Insert(String MaChatLieu, String TenChatLieu) {
        Connection con = DBConnect.KetNoi();
        if (con != null) {
            try {
                Statement stmt = con.createStatement();
                String sql = "insert into tblChatLieu(MaChatLieu,TenChatLieu) values ('" + MaChatLieu + "',N'" + TenChatLieu + "')";
                int rs = stmt.executeUpdate(sql);
                if (rs < 1) {
                    con.close();
                    return 0;
                } else {
                    con.close();
                    return 1;
                }
            } catch (SQLException ex) {
                return 0;
            }
        }
        return 0;
    }

    public static int Update(String MaChatLieu, String TenChatLieu) {
        Connection con = DBConnect.KetNoi();
        if (con != null) {
            try {
                Statement stmt = con.createStatement();
                String sql = "update tblChatLieu set TenChatLieu = N'" + TenChatLieu + "' where MaChatLieu = '" + MaChatLieu + "'";
                int rs = stmt.executeUpdate(sql);
                if (rs < 1) {
                    con.close();
                    return 0;
                } else {
                    con.close();
                    return 1;
                }
            } catch (SQLException ex) {
                return 0;
            }
        }
        return 0;
    }

    public static int Delete(String MaChatLieu) {
        Connection con = DBConnect.KetNoi();
        if (con != null) {
            try {
                Statement stmt = con.createStatement();
                String sql = "delete from tblChatLieu where MaChatLieu = '" + MaChatLieu + "'";
                int rs = stmt.executeUpdate(sql);
                if (rs < 1) {
                    con.close();
                    return 0;
                } else {
                    con.close();
                    return 1;
                }
            } catch (SQLException ex) {
                return 0;
            }
        }
        return 0;
    }
    }
    
