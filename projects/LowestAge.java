// Lowest Age Calculator

import java.util.Scanner;

public class LowestAge {
    
    public static void main(String[] agrs)
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("How many ages do you want to add : ");
        int num_age = scn.nextInt();
        
        int ages[] = new int[num_age];
        System.out.println("Enter the ages : ");
        for(int i=0; i<num_age; i++)
        {
            ages[i] = scn.nextInt();
        }
        int lowest_age = ages[0];
    
        for(int age : ages)
        {
            if(lowest_age > age)
            {
                lowest_age = age;
            }
        }

        System.out.println("The lowest age from them is " + lowest_age);

        scn.close();
    }
}
