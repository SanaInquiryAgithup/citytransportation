/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportation;

import java.util.Random;
import java.util.Scanner;

public class DRIVER extends PERSON {
    //employee
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    private final int idcard = 0 + r.nextInt(9999);
    private int age;
    private int Ephoneno;
    private String taxiBus;
    private String location;

    public void setInput(Scanner input) {
        this.input = input;
    }
    public void setR(Random r) {
        this.r = r;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEphoneno(int Ephoneno) {
        this.Ephoneno = Ephoneno;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getIdcard() {
        return idcard;
    }

    public int getAge() {
        return age;
    }

    public int getEphoneno() {
        return Ephoneno;
    }

    public String getTaxiBus() {
        return taxiBus;
    }

    public void setTaxiBus() {
        System.out.println("Do you have taxi or bus");
        taxiBus = input.next().toLowerCase();
        switch (taxiBus) {

            case "taxi":
             display();
                break;
            case "bus":
 }
}
  public String getLocation() {
        return location;
    }
 public void input() {
        super.input();
        //System.out.println(getIdcard());
        System.out.println("what is your age?");
        age = input.nextInt();
        System.out.println("what is your phone number?");
        Ephoneno = input.nextInt();
        if(Ephoneno!=11){
            System.out.println("number of character should be 11!");
        }
        System.out.println("in which city do you live?");
        location = input.next();
        setTaxiBus();
    }
    public void display() {
         VEHICLE v = new VEHICLE();
        v.input();
        System.out.println("Here are the Information you assigned");
        System.out.println("Name\t\tIDcard\t\tAge\t\tPhone No.\t\tLocation\t\tCarType\n"
                + "-------\t\t------\t\t-----\t\t------------\t\t----------\t\t----------\n"
                + super.getname() + "\t\t" + getIdcard() + "\t\t" + getAge() + "\t\t" + getEphoneno() + "\t\t" + getLocation() + "\t\t" + getTaxiBus());
        System.out.println("Do you want to see the vehicle's Information?");
        String veh = input.next().toLowerCase();
        switch (veh) {
            case "yes":
                System.out.println("Model\tBrand\tPlate Number\tYear\tNumber of Seats");
                System.out.println("-----\t------\t-----------\t----\t---------\n");
                System.out.println(v.getModel() + "\t" + v.getBrand() + "\t" + v.getPlateno() + "\t\t" + v.getYear() + "\t" + v.getNoseat());
case "no":
                break;
        }

    }
}
