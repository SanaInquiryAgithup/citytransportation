/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportation;

import java.util.Scanner;
 import java.util.ArrayList;
public class TRANSPORTATIONmain {
public static void main(String[] args) {
        //String model, int plateno, int year, String brand, String name
       Scanner input = new Scanner(System.in);
        DRIVER d = new DRIVER();
        CUSTOMER c = new CUSTOMER();
        VEHICLE v=new VEHICLE();
        ArrayList<DRIVER> dr = new ArrayList<>();
        ArrayList<CUSTOMER> co = new ArrayList<>();
        ArrayList<VEHICLE> ve = new ArrayList<>();
        System.out.println("Thanks for using our Transportation System");
System.out.println("1-->Add Information\n2-->Show Information\n3-->Update Information\n4-->Remove Information");
        int n=input.nextInt();
        switch(n){
            case 1:
        System.out.println("driver or customer");
        String option = input.next().toLowerCase();
         switch (option) {
            case "driver":
               
                d.input();
             
                break;
            case "customer":
             c.input();
             
                break;
                 }
            case 2:
                System.out.println("what did you choose\ncustomer or driver");
                        String op=input.next();
       if(op.equals("driver")){
              d.display();
       }
       else if(op.equals("custumer")){
        c.display();
       }
            case 3:
                
        
        
        
        
        
        
        }}



}





           /*case 2:
                if(option.equals("driver"))
                System.out.println("This is the Information you assigned");
               
        if (option.equals("customer"));
        System.out.println("This is the Information you assigned");
        
           case 3:
             
              
         */
          /* package Transportation;

import java.util.ArrayList;
import java.util.Scanner;
/*

class Driver {
    // Assuming you have appropriate fields, constructor, input, display methods
}

class Customer {
    // Assuming you have appropriate fields, constructor, input, display methods
}

class Vehicle {
    // Assuming you have appropriate fields, constructor, input, display methods
}



        Scanner input = new Scanner(System.in);
        ArrayList<DRIVER> driversList = new ArrayList<>();
        ArrayList<COSTUMER> customersList = new ArrayList<>();
        ArrayList<VEHICLE> vehiclesList = new ArrayList<>();

        System.out.println("Thanks for using our Transportation System");
        System.out.println("1-->Add Information\n2-->Show Information\n3-->Update Information\n4-->Remove Information");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Driver or Customer?");
                String option = input.next().toLowerCase();
                switch (option) {
                    case "driver":
                        DRIVER newDriver = new DRIVER();
                        newDriver.input();
                        driversList.add(newDriver);
                        break;
                    case "customer":
                        COSTUMER newCustomer = new COSTUMER();
                        newCustomer.input();
                        customersList.add(newCustomer);
                        break;
                    // Add cases for other options as needed
                }+

                break;

            case 2:
                System.out.println("Driver or Customer?");
                String displayOption = input.next().toLowerCase();
                switch (displayOption) {
                    case "driver":
                        System.out.println("This is the Information you assigned");
                        for (DRIVER driver : driversList) {
                            driver.display();
                        }
                        break;
                    case "customer":
                        System.out.println("This is the Information you assigned");
                        for (COSTUMER customer : customersList) {
                            customer.display();
                        }
                        break;
                    // Add cases for other options as needed
                }
                break;

            case 3:
                // Implement logic for updating information using set method
                System.out.println("Update Driver or Customer Information?");
                String updateOption = input.next().toLowerCase();
                switch (updateOption) {
                    case "driver":
                        // Implement driver update logic
                        break;
                    case "customer":
                        // Implement customer update logic
                        break;
                    // Add cases for other options as needed
                }
                break;

            case 4:
                // Implement logic for removing information using clear method
                System.out.println("Remove Driver or Customer Information?");
                String removeOption = input.next().toLowerCase();
                switch (removeOption) {
                    case "driver":
                        driversList.clear();
                        System.out.println("All driver information removed.");
                        break;
                    case "customer":
                        customersList.clear();
                        System.out.println("All customer information removed.");
                        break;
                    // Add cases for other options as needed
                }
                break;

            default:
                System.out.println("Invalid option");
        }

      
    */

         
      
         
    
    
    
        
       
        
        
        
        
     
        
    
    

