/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportation;
import java.util.Scanner;
import java.util.regex.Pattern;
public class PERSON {
//superclass
    private String name;
    Scanner input = new Scanner(System.in);
//for the location we have the address that the driver came from but for the costumer we want the location that the costumer wants to arrive
    public void setPERSON(String name) {
        this.name = name;
}    public String getName() {
        return name;
    }
public void input() {
     System.out.println("what is your name?");
        name = input.next();
}
public void setInput(Scanner input) {
        this.input = input;
    }

    public Scanner getInput() {
        return input;
    }
    

}
