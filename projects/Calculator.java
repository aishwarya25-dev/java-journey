// User Input Simple Calculator.

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        //Arithmatic operations:

        // int a = 23;
        // int b = 34;

        // System.out.println("Addition : " + (a+b));
        // System.out.println("Subtraction : " + (a-b));
        // System.out.println("Multiplication : " + (a*b));
        // System.out.println("Division : " + (a/b));
        // System.out.println("Modulus : " + (a%b));

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = Integer.parseInt(scn.nextLine());

        System.out.print("Enter the second number : ");
        int b = Integer.parseInt(scn.nextLine());

        System.out.println("Choose the operations to perform:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        
        System.out.print("Enter your choice: ");
        int choice = scn.nextInt();
        

        switch(choice) {
            case 1:
                System.out.println("Addition : " + (a+b));
                break;

            case 2:
                System.out.println("Subtraction : " + (a-b));
                break;

            case 3:
                System.out.println("Multiplication : " + (a*b));
                break;
            
            case 4:
                System.out.println("Division : " + (a/b));
                break;

            case 5:
                if(b==0)
                {
                    System.out.println("Zero division Error(you can't divide by zero),");
                }
                else
                {
                System.out.println("Modulus : " + (a%b));
                }
                break;

            default:
                System.out.println("Invalid operation entered!!");

        }

        scn.close();
    
    }

}
