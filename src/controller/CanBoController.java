/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import connect.DBConnection;
import model.CanBo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manht
 */
public class CanBoController {
    public static Connection conn = DBConnection.getConnection();
    public static ArrayList<CanBo> getKySu(){
        ArrayList<CanBo> list =  new ArrayList<>();
        int STT =0;
        try {
            Statement st =  conn.createStatement();    
            ResultSet rs = st.executeQuery("SELECT * FROM canbo where ChucVu = 'Kỹ sư'");
            while(rs.next()){
                STT++;
                String hoTen = rs.getString("HoTen");
                String gioiTinh = rs.getString("GioiTinh");
                String diaChi = rs.getString("DiaChi");
                String chucVu = rs.getString("ChucVu");
                String moTa = rs.getString("MoTa");
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String namSinh = rs.getString("NamSinh");
                int ID = rs.getInt("ID");
                int isAdmin = rs.getInt("isAdmin");
                CanBo cb = new CanBo(STT,ID, hoTen,  namSinh,  gioiTinh,  diaChi,  chucVu,  
                        moTa,  username,  password, isAdmin);
                list.add(cb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CanBoController.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return list;
    }
    public static ArrayList<CanBo> getCongNhan(){
        ArrayList<CanBo> list =  new ArrayList<>();
        int STT =0;
        try {
            Statement st =  conn.createStatement();            
            ResultSet rs = st.executeQuery("SELECT * FROM canbo where ChucVu = 'Công nhân'");
            while(rs.next()){
                STT++;
                String hoTen = rs.getString("HoTen");
                String gioiTinh = rs.getString("GioiTinh");
                String diaChi = rs.getString("DiaChi");
                String chucVu = rs.getString("ChucVu");
                String moTa = rs.getString("MoTa");
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String namSinh = rs.getString("NamSinh");
                int ID = rs.getInt("ID");
                int isAdmin = rs.getInt("isAdmin");
                CanBo cb = new CanBo(STT,ID,hoTen,  namSinh, gioiTinh,  diaChi,  chucVu,  
                        moTa,  username,  password, isAdmin);
                list.add(cb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CanBoController.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return list;
    }
    public static ArrayList<CanBo> getNhanVien(){
        ArrayList<CanBo> list =  new ArrayList<>();
        int STT =0;
        try {
            Statement st =  conn.createStatement();          
            ResultSet rs = st.executeQuery("SELECT * FROM canbo where ChucVu = 'Nhân Viên'");
            while(rs.next()){
                STT++;
                String hoTen = rs.getString("HoTen");
                String gioiTinh = rs.getString("GioiTinh");
                String diaChi = rs.getString("DiaChi");
                String chucVu = rs.getString("ChucVu");
                String moTa = rs.getString("MoTa");
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String namSinh = rs.getString("NamSinh");
                int ID = rs.getInt("ID");
                int isAdmin = rs.getInt("isAdmin");
                
                CanBo cb = new CanBo(STT,ID, hoTen, namSinh,  gioiTinh,  diaChi,  chucVu,  
                        moTa,  username,  password, isAdmin);
                list.add(cb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CanBoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static boolean checkAdmin(String user,String pass){
        String sql = "SELECT isAdmin FROM canbo WHERE Username = '"+user+"'and Password = '"+pass+"'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int is = rs.getInt("isAdmin");
                if(is==1){
                    return true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean checkUser(String user,String pass){
        String sql = "SELECT isAdmin FROM canbo WHERE Username = '"+user+"'and Password = '"+pass+"'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int is = rs.getInt("isAdmin");
                if(is==0){
                    return true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public static String getName(String user){
        String sql = "SELECT * FROM canbo WHERE Username = '"+user+"'";
        String fullName = "";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               fullName = rs.getString("HoTen");
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return fullName;
    }
    public static ArrayList<CanBo> getUser(String user){
         String sql = "SELECT * FROM canbo WHERE Username = '"+user+"'";
         ArrayList<CanBo> list =  new ArrayList<>();
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CanBo cb = new CanBo();
                cb.setHoTen(rs.getString("HoTen"));
                cb.setGioiTinh(rs.getString("GioiTinh"));
                cb.setDiaChi(rs.getString("DiaChi"));
                cb.setUsername(rs.getString("Username"));
                cb.setPassword(rs.getString("Password"));
                cb.setNamSinh(rs.getString("NamSinh"));
                cb.setID(rs.getInt("ID"));             
                list.add(cb);
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static int addPerson(CanBo cb){
        String sql = "INSERT INTO canbo(HoTen,NamSinh,GioiTinh,DiaChi,ChucVu,MoTa,"
                + "Username,Password,isAdmin) VALUES(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cb.getHoTen());
            ps.setString(2, cb.getNamSinh());
            ps.setString(3, cb.getGioiTinh());
            ps.setString(4, cb.getDiaChi());
            ps.setString(5, cb.getChucVu());
            ps.setString(6, cb.getMoTa());
            ps.setString(7, cb.getUsername());
            ps.setString(8, cb.getPassword());
            ps.setInt(9, cb.getIsAdmin());
            if(ps.executeUpdate() > 0){
                System.out.println("DONE");
            }else{
                System.out.println("Failed");
            }
            return 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }
    public static boolean deletePerson(int idDelete){
        String sql = "DELETE FROM canbo WHERE ID = '"+idDelete+"'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);          
            if(ps.executeUpdate() > 0){
                return true;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean updatePerson(CanBo cb){
        String sql = "UPDATE canbo SET HoTen = ? , NamSinh = ? , GioiTinh = ? , DiaChi = ? ,"
                + "ChucVu = ? , MoTa = ?, Username = ?, Password = ? ,isAdmin = ? WHERE ID = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cb.getHoTen());
            ps.setString(2, cb.getNamSinh());
            ps.setString(3, cb.getGioiTinh());
            ps.setString(4, cb.getDiaChi());
            ps.setString(5, cb.getChucVu());
            ps.setString(6, cb.getMoTa());
            ps.setString(7, cb.getUsername());
            ps.setString(8, cb.getPassword());
            ps.setInt(9, cb.getIsAdmin());
            ps.setInt(10, cb.getID());
            if(ps.executeUpdate() > 0){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean updatePersonUser(CanBo cb){
        String sql = "UPDATE canbo SET HoTen = ? , NamSinh = ? , GioiTinh = ? , DiaChi = ? ,"
                + "Username = ?, Password = ? WHERE ID = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cb.getHoTen());
            ps.setString(2, cb.getNamSinh());
            ps.setString(3, cb.getGioiTinh());
            ps.setString(4, cb.getDiaChi());
          
            ps.setString(5, cb.getUsername());
            ps.setString(6, cb.getPassword());
       
            ps.setInt(7, cb.getID());
            if(ps.executeUpdate() > 0){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public static int checkUsername(String user){
        String sql = "SELECT * FROM canbo WHERE Username = '"+user+"'";
        int kq = 0;
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                kq =1;
              
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return kq;
    }
    public static ArrayList<CanBo> search(String name){
        String sql = "select * from canbo where HoTen like'%" + name + "%'";
        ArrayList<CanBo> list =  new ArrayList<>();
        try{
            PreparedStatement ps = conn.prepareStatement(sql);    
            int STT = 1;
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CanBo cb = new CanBo();
                cb.setSTT(STT++);
                cb.setID(rs.getInt("ID"));     
                cb.setHoTen(rs.getString("HoTen"));
                cb.setNamSinh(rs.getString("NamSinh"));
                cb.setGioiTinh(rs.getString("GioiTinh"));
                cb.setDiaChi(rs.getString("DiaChi"));
                cb.setChucVu(rs.getString("ChucVu"));
                cb.setMoTa(rs.getString("MoTa"));
                cb.setUsername(rs.getString("Username"));
                cb.setPassword(rs.getString("Password"));
                cb.setIsAdmin(rs.getInt("isAdmin"));
                        
                list.add(cb);
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
