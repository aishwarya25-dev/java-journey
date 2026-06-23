// Student Grade System

import java.util.Scanner;

public class StudentGradeSystem {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Maths marks: ");
        int a = Integer.parseInt(scn.nextLine());

        System.out.print("Enter the AI marks: ");
        int b = Integer.parseInt(scn.nextLine());

        System.out.print("Enter the DSA marks: ");
        int c = Integer.parseInt(scn.nextLine());

        System.out.print("Enter the ML marks: ");
        int d = Integer.parseInt(scn.nextLine());

        int total_marks = a + b + c + d;
        
        double x = total_marks / 4.0;

        System.out.println("Total Marks: " + total_marks);
        System.out.println("Percentage: " + x);

        if (x >= 90) 
        {
            System.out.println("GRADE : A ");
        }

        else if (x >= 80)
        {
            System.out.println("GRADE : B ");
        }

        else if (x >= 70)
        {
            System.out.println("GRADE : C ");
        }

        else if (x >= 60)
        {
            System.out.println("GRADE : D ");
        }

        else
        {
            System.out.println("You got Fail!!!! ");
        }
    
        scn.close();

    }
}
