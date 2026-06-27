/*  
Ugly Number :An Ugly Number is a positive number, whose prime factors are only 2, 3, and 5.

Rule:
 Keep dividing the number by 2, 3, and 5 as much as possible:

 - If the final result becomes 1, it is an ugly number.
 - Otherwise, it is not an ugly number.
*/

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