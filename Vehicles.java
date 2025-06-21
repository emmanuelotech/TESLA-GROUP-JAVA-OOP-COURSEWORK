/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utms.universitytransportmanagementsystem;

/**
 *
 * @author System46
 */

public class Vehicles {
    private String vehicleName;
    private String vehicleType;
    private String shiftTime;
    private String vehicleManufactureDate;
    String vehicleLicencePlate;
        
    // L/100kms ->This will  heelep in computing the Cost efficiency of a person #Deeper Analysis
    // FuelEff[L/100kms] = ((TotalFuelTaken)/TotalDistanceCoveredBeforeNExtRefuel)*100
    //Converting the fueling back to money based on efficiency obtainned --> distance*(eff(L/100km))*UnitPrice.
    double vehicleFuelEfficiency; 
    String vehicleMaximumCapacity;
    
    //Welcomng boolean characters.
    String IsServiceable; 
    String IsTrackable;
    String IsScheduleable; //boolean either true or false.
    
    public void assignDriver(){
                
        Users driver = new Users();
            
        String assignedDriverToVehicle = driver.fullName;
        
        
     }
    
    
    
    
}
