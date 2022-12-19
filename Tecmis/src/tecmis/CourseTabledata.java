/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecmis;

import mis.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author rravi
 */
public class CourseTabledata {
        public ArrayList<Course> courseList() throws SQLException, ClassNotFoundException{
        ArrayList<Course> courseList = new ArrayList<>();
        
        
            dbconnect db = new dbconnect();
//            String  url = "jdbc:mysql://localhost:3306/mis";
//            String user = "root";
//            String pwd = "1234";
//            Class.forName("com.mysql.cj.jdbc.Driver"); 
//            Connection conn = DriverManager.getConnection(url,user,pwd);
            db.connection();
            
            String query1 = "SELECT * FROM course";
            Statement st = db.conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            
            Course course1;
            
            while(rs.next()){
                course1 = new Course(rs.getString("course_code"),rs.getString("course_name"),rs.getString("department_id"),rs.getInt("credits"));
                courseList.add(course1);
        
            }
        return courseList;
    }
    
}
