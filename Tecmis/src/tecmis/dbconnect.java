/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecmis;

import java.sql.*;


/**
 *
 * @author rravi
 */
public class dbconnect {
   public Connection conn;
    public void connection() throws ClassNotFoundException, SQLException{
         String  url = "jdbc:mysql://localhost:3306/mis";
        String user = "root";
        String pwd = "1234";
        Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection(url,user,pwd);
    }
}
