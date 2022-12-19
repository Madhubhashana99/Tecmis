package tecmis;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Course {

    private int coursecredit;
    private String coursecode,coursename,department;
    
    public Course(String coursecode,String coursename,String department,int coursecredit){
        
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.department = department;
        this.coursecredit= coursecredit;
        
    }
    
   
    public String getname(){
        return coursename;
    }
    public String getdep(){
        return department;
    }
    public int getcredit(){
        return coursecredit;
    }
    public String getcode(){
        return coursecode;
    }
    
    
}
