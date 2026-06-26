// Calculator using interface

import java.io.*;


// An interface in Java is a blueprint that defines methods a class must implement.
interface Add
{
    int add(int a, int b);
}

interface Sub
{
    int sub(int a, int b);
}

interface Mul
{
    int mul(int a, int b);
}

interface Div
{
    double div(int a, int b);
}


class Cal implements Add, Sub, Mul, Div
{
    public int add(int a, int b)
    {
        return a+b;
    }

    public int sub(int a, int b)
    {
        return a-b;
    }

    public int mul(int a, int b)
    {
        return a*b;
    }

    public double div(int a, int b)
    {
        return (double) a/b;
    }
}



public class CalculatorUsingInterface {

    public static void main(String[] args) throws IOException
    {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));

        Cal x = new Cal();

        System.out.print("Enter first number : ");
        int a = Integer.parseInt(brf.readLine());

        System.out.print("Enter second number : ");
        int b = Integer.parseInt(brf.readLine());

        

        System.out.println("CALCULATOR");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");

        System.out.println("Enter your choice : ");
        int choice = Integer.parseInt(brf.readLine());

        switch (choice) {
            case 1:
                System.out.println("Addition : " + x.add(a, b));
                break;

            case 2:
                System.out.println("Subtraction : " + x.sub(a, b));
                break;

            case 3:
                if(b == 0)
                {
                    System.out.println("Zero Division Error(You can't divide bt zero).");
                }
                else
                {
                    System.out.println("Division : " + x.div(a,b));
                }
                break;

            case 4:
                System.out.println("Multiplictaion : " + x.mul(a,b));
                break;

            case 5:
                System.out.println("Byeeee!!!!");
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
    
}
