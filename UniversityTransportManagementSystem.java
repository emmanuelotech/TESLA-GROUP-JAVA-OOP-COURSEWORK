/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package utms.universitytransportmanagementsystem;

/**
 *
 * @author System46
 */
public class UniversityTransportManagementSystem {

    public static void main(String[] args) {
        System.out.println("UNIVERSITY TRANSPORT MANAGEMENT SYSTEM - TESLA GROUP C.W!");
        System.out.println(".............................................................");
        Users newUser = new Users();
        
        System.out.println("OPERATION: USER RECORD - UPDATE");
        System.out.println(".............................................................");
        
        System.out.println("Update Operation Completed Successfully with records...!");
        //newUser.updateUserRecords("CM68106178051LQE", "EMMANUEL OKELLO", "Students");
        newUser.updateUserRecords(); // The inputs are oging to be requested from the User class instantion.
        System.out.println(".............................................................");
        
        
    }
}
