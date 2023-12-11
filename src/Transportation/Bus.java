/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Transportation;
public class Bus extends CUSTUMER{
    private int nopassenger;
    private double price;

    public int getNopassenger() {
        return nopassenger;
    }

    public void setNopassenger(int nopassenger) {
        this.nopassenger = nopassenger;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     public void bus(){
       super.input();
         System.out.println("How many passengers are there?");
       nopassenger=input.nextInt();
     if (super.getCurrentAdd().equals("slemani") && super.getAddress().equals("erbil") || super.getCurrentAdd().equals("erbil") && super.getAddress().equals("slemani")) {
             price =nopassenger*10;

                } else if (super.getCurrentAdd().equals("slemani") && super.getAddress().equals("duhok") || super.getCurrentAdd().equals("duhok") && super.getAddress().equals("slemani")) {
                    price = nopassenger*5;
                } else if (super.getCurrentAdd().equals("erbil") && super.getAddress().equals("duhok") || super.getCurrentAdd().equals("duhok") && super.getAddress().equals("erbil")) {
                    price = nopassenger*7;
       break;
     
     }   
    
     public void display(){
        public void display() System.out.println("Do you want to see the Bus's Information?");
        String veh=input.next().toLowerCase();
        switch(veh){
        case "yes":
         System.out.println("Name\tgender\tDeparture\tDestination\tNoPassenger\tprice\n"
                + "-------\t------\t------------\t-------------\t--------------\t--------\t-----------\n"
                + super.getname() + "\t" + super.getGender() + "\t" + super.getCurrentAdd() + "\t\t" + super.getAddress() + "\t\t" +getNopassenger+ "\t\t" +getPrice);
        case "no":
        break;
        System.out.println("Invalid answer");
        }
       } 
        
  
    
    
    
}}
