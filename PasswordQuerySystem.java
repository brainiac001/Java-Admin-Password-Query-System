/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package password.query.system;
import java.util.Scanner;
/**
 *
 * @author brainiac
 */
public class PasswordQuerySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String adminPassword, userinput, name;
     adminPassword = "dochtech2020";
     Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name -> ");
        name = scan.next();
        System.out.print("Enter Admin password -> ");
        userinput = scan.next();
        if (adminPassword.equals(userinput)){
            System.out.println("Welcome "+name);
        } else
        {
            System.out.println("Incorrect password");
        }
        
    }
    
}
