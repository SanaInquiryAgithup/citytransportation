/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportation;
//vehicle

import java.util.Scanner;
public class VEHICLE {
Scanner input=new Scanner(System.in);
    private String model;
    private int plateno;
    private int year;
    private String brand;
    private int noseat;
    public int getNoseat() {
        return noseat;
    }
    public void setNoseat(int noseat) {
        this.noseat = noseat;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPlateno() {
        return plateno;
    }
    public void setPlateno(int plateno) {
        this.plateno = plateno;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /*  public void taxibus() {
        System.out.println("Do you have taxi or bus");
        String taxibus=super.input.next();
   if(taxibus==taxi){
       
   }
   switch(taxibus){
            case 1:
                System.out.println("");
            
        }
    */
public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your car model?");
        model = input.next();
        System.out.println("what is your Brand car?");
        brand = input.next();
        System.out.println("What is your car plate number");
        plateno = input.nextInt();
        System.out.println("What  year your car produced?");
        year = input.nextInt();
        if(year<2009){
            System.out.println("To be hired in our company your car must be greater than 2009");
        }
        System.out.println("How many seats does your car have?");
        noseat = input.nextInt();
}
public void display() {
    
        

    }

}
