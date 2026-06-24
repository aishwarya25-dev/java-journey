// Palindrome

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number to check : ");
        int x = scn.nextInt();

        if(x < 0)
        {
            System.out.println("Not a palindrome");
            scn.close();
            return;
        }

        int org = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        if(rev == org)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

        scn.close();
    }
}
