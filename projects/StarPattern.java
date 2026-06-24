// Star Pattern

import java.util.Scanner;

public class StarPattern {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int x = scn.nextInt();

        for(int i=1; i<=x; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        scn.close();
    }
}
