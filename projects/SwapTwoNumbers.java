// Swap two numbers

import java.util.Scanner;

public class SwapTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = scn.nextInt();

        System.out.print("Enter the second number : ");
        int b = scn.nextInt();

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swaping the two numbers.");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        scn.close();
        
    }

}