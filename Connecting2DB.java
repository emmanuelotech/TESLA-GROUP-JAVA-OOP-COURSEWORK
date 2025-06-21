/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VUExhibitionForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static org.testcontainers.shaded.org.bouncycastle.asn1.x500.style.RFC4519Style.st;

/**
 *
 * @author System46
 */
public class Connecting2DB {
    
    
    public void viewRecords(JTable table) throws ClassNotFoundException, SQLException{
    Class.forName ("net.ucanaccess.jdbc.UcanaccessDriver");
    
    
    try{
    Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/VU_Exhibition.accdb");

    System.out.println("Connected successfully to database...!");
    
    Statement st = con.createStatement();
    String sql = "SELECT * FROM participants";
    ResultSet rs = st.executeQuery(sql);
    table.setModel(DbUtils.resultSetToTableModel(rs));
  
    
    
    }catch(SQLException ex){
        System.out.println("...Again something went wrong!");
    
    }

    
    }
    
    
      }  
  
    
    
    
    
