/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author 
 */
public class StudentInfo {
    String hoTen;
    String namSinh;
    String gioiTinh;
    public void sethoTen(String hoten)
    {
        hoTen=hoten;
    }
    public String getHoten()
    {
      return hoTen;
    }
    public void setnamSinh(String namsinh)
    {
        namSinh=namsinh;
    }
    public String getNamsinh()
    {
      return namSinh;
    }
    
    public void setgioiTinh (String gioitinh)
    {
        gioiTinh=gioitinh;
    }
    public String getgioiTinh()
    {
        return gioiTinh;
    }
}
