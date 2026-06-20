// Eligibility Checker using if-else 

import java.util.Scanner;

public class DrivingLicenseEligibilityChecker  {

    public static void eligibility(int age)
    {
        
        if(age < 16)
        {
            System.out.println("You are not eligible for driving license.");
        }
        else if(age >= 16 && age < 18)
        {
            System.out.println("You are eligible for learner's license.");
        }
        else
        {
            System.out.println("You are eligible for permanent license!!");
        }
        
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = scn.nextInt();

        eligibility(age);

        scn.close();
    }
 
}