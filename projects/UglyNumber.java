// Ugly Number :

import java.util.Scanner;

public class UglyNumber
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scn.nextInt();

        if(n <= 0)
        {
            System.out.println("False");
            scn.close();
            return;
            
        }

        while(n%2 == 0)
        {
            n /= 2;
        }

        while(n%3 == 0)
        {
            n /= 3;
        }

        while(n%5 == 0)
        {
            n /= 5;
        }

        System.out.println(n == 1);

        scn.close();

    }
}