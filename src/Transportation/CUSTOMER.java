/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportation;

public class CUSTOMER extends PERSON{
   
//customer
    private String gender;
    private String destination;
    private String CurrentAdd;
    private String bustaxi;
   //String array []=new String(6);
    public String getBustaxi() {
        return bustaxi;
    }

    public void setBustaxi(String bustaxi) {
        this.bustaxi = bustaxi;
    }

    public String getCurrentAdd() {
        return CurrentAdd;
    }

    public void setCurrentAdd(String CurrentAdd) {
        this.CurrentAdd = CurrentAdd;
    }
//customer behaivior

    public void setCOSTUMER(String gender, String destination, String name) {

        this.gender = gender;
        this.destination = destination;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return destination;
    }

    public void setAddress(String destination) {
        this.destination = destination;
    }

    public void input() {
        super.input();
        System.out.println("what is your gender");
        gender = input.next().toLowerCase();
        switch (gender) {
            case "female":

                break;
            case "male":
                break;
        }
        //
        System.out.println("Your current address: ");
        CurrentAdd = input.next().toLowerCase();//slemani or erbil cityakan
setCurrentAdd(CurrentAdd);
        System.out.println("Where do you want to go?");
        destination = super.input.next().toLowerCase();

        System.out.println("Do you want to go by bus or taxi?");
        bustaxi = input.next().toLowerCase();

        switch (bustaxi) {
            case "taxi":
                Taxi t = new Taxi();
                t.taxi();
                break;
            case "bus":
                Bus b = new Bus();
                b.bus();

        }
    }

    public void display() {
        System.out.println("Name\tgender\tDeparture\tDestination\tNo.Passenger\tPrice");
        System.out.println(super.getName() + "\t" + getGender() + "\t" + getCurrentAdd() + "\t" + getAddress() + "\t" + getNopassenger() + "\t" + getPrice());

    }
}

    
    
    
    
    
    
    
    
    

