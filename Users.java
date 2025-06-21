/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utms.universitytransportmanagementsystem;

/**
 *
 * @author System46
 */

import java.util.Scanner;

public class Users {
    
    
  
    //USER DIFFERENT VARIABLES (PARAMETERS)/ATTRIBUTESSS
    String userNIN; //National Identification Number
    String fullName;
    String userCategory;
    
    
    //START - What can the user do - #Methods
    public void AssignedVehicle(){
        System.out.println("Vehicle Assigned Successfully!");
    }
    //END - OF drive Method fo rthe user
    
    public void AssignedRoute(String routeAssigned){
        System.out.println("Route: " + routeAssigned + "Has been assigned Successfully");
        }
    
    public void updateUserRecords(){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter Gov't Issued NIN: "); //Requesiting for NIN number
        userNIN = userInput.nextLine(); //receive Text information from the user chap chap.
        
        System.out.println("Enter FULL NAME: "); //Requesting for users full lnNMAES
        fullName = userInput.nextLine(); //receive Text information from the user chap chap.
        
        System.out.println("Enter Category[Students,Transport Officers,Lecturer]: "); //provides headsup for usser.
        userCategory = userInput.nextLine(); //receive Text information from the user chap chap.
        
        //START OF CODE COSMETICS
        System.out.println(""); //Creating some space 
        System.out.println("System has been updated Successfully with records below...!"); //Creating some space 
        System.out.println(""); //Creating some space 
        //END OF CODE 
        
        //ASSIGNING VEHICLE TO USER
        Vehicles vehicle = new Vehicles(); //instantiating an instance of the Vehicles class
        
        System.out.println("Enter VEHICLE NO PLATE:  ");
                      
        
        System.out.println("NIN: " + userNIN);
        System.out.println("FULL NAME: " + fullName);
        System.out.println("USER CATEGORY: " + userCategory);
        System.out.println(vehicle.vehicleLicencePlate);
        
        
        
    }
    

    
 //END OF THE CLASS - DON"T WRRITE ANY CODDE BELOW THE CURLY BRACEESS.   
} 
