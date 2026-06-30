// Simple login System 

import java .util.Scanner;

public class LoginSystem {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        String Correctusername = "wabisabi@1234";
        String Correctpassword = "wabisabi";

        System.out.print("Enter Username : ");
        String username = scn.nextLine();

        System.out.print("Enter your password : ");
        String password = scn.nextLine();

        if (username.equals(Correctusername) && password.equals(Correctpassword))
        {
            System.out.println("Login Succesfull.");
        }

        else
        {
            System.out.println("Invalid username and password");
        }

        scn.close();


    }
}
