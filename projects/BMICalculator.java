// BMI Calculator

import java.util.Scanner;

class inputs
{
    float weight;
    int feet;
    int inch;

    inputs(float weight, int feet, int inch)
    {
        this.weight = weight;
        this.feet = feet;
        this.inch = inch;
    }

    float cal()
    {
        float total_height = (this.feet * 12) + this.inch;

        float height_in_meter = total_height * 0.254f;

        return this.weight/(height_in_meter * height_in_meter);
    }
}

public class BMICalculator {
    
    public static void main(String[] argd)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the weight : ");
        float weight = scn.nextFloat();

        System.out.print("Enter the height(feet) : ");
        int feet = scn .nextInt();

        System.out.print("Enter the inch for height : ");
        int inch = scn.nextInt();

        inputs user = new inputs(weight, feet, inch);

        float Inputs = user.cal();

        System.out.printf("BMI : %.2f%n", Inputs );

        if(Inputs < 18.5)
        {
            System.out.println("Underweight");
        }
        else if(Inputs < 25)
        {
            System.out.println("Normal Weight");
        }
        else if(Inputs < 30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }

        scn.close();

    }
}
