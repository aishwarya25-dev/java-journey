// Factorial

import java.util.Scanner;

public class Factorial {

    static int num(int n)
    {
        if(n > 1)
        {
            return n * num(n - 1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scn.nextInt();

        int result = num(n);
        System.out.println("The factorial of " + n + " is " + result);

        scn.close();
    }
    
}
