/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VUExhibitionForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author System46
 */
public class UpdateRecords {
    
    int updateID = 6; //7
    String updateStudentName ="Emmanuel Okello";//1
    String updateRegistrationID = "VU-BCS-2403-0247-EVE";//2
    String updateFaculty = "FST";//3
    String updateProjectTitle = "JAVA - OOP"; //4
    String updateContactNumber = "+256774312878"; //5
    String updateEmailAddress = "emmanuelokellopyconuganda@gmail.com"; //6
    
    Statement st;
   
    
    public static void myUpdateConnection(int updateID, String updateRegistrationID,String updateStudentName,String updateFaculty, String updateProjectTitle, String updateContactNumber, String updateEmailAddress) throws ClassNotFoundException, SQLException{
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/VU_Exhibition.accdb");
    System.out.println("Database Connection Established...!");
    
    String updateSyntax = "UPDATE participants SET StudentName=(?), RegistrationID=(?),Faculty=(?),ProjectTitle=(?),ContactNumber=(?),EmailAddress=(?) WHERE ID=(?)";
    PreparedStatement pst = con.prepareStatement(updateSyntax);
    pst.setString(1,updateStudentName);
    pst.setString(2, updateRegistrationID);
    pst.setString(3, updateFaculty);
    pst.setString(4, updateProjectTitle);
    pst.setString(5, updateContactNumber);
    pst.setString(6, updateEmailAddress);
    pst.setInt(7, updateID);
    
    pst.executeUpdate();
    
    System.out.println("Records have been updated Successfully..!");
    
    
    
    }
    
    public void main(String[] args) throws ClassNotFoundException, SQLException{
        //myUpdateConnection(12,"VU-BCS-2403-0247-EVE","Emmanuel Okello","RESEARCH SCIENTIST","PRESENTATION","+2577743434","emma@gmail.com");
        myUpdateConnection(12,"VU-BCS-2403-0247-EVE","Emmanuel Okello","RESEARCH SCIENTIST","PRESENTATION","+2577743434","emma@gmail.com");
    }
    
    
}
