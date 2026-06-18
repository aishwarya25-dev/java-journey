// Taking input by Scanner class

import java.util.Scanner;

public class Input_By_Scanner {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scn.nextLine();
        System.out.println("Hello " + name);

        scn.close();

    }
    
}
