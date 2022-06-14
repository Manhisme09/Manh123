/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DBConnection {
    
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/qlcanbo";
        var user = "root";
        var password = "";
        try {
            return DriverManager.getConnection(url,user,password);
        }catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/j2school2";
//        var user = "root";
//        var password = "";
//        try(Connection conn = DriverManager.getConnection(url,user,password)){
//            System.out.println("Kết nối MYSQL thành công");
//            System.out.println(conn.getCatalog());
//        }catch (SQLException ex) {
//            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}

