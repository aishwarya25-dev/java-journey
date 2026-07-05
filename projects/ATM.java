// ATM Machine

import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int choice ;
        double Bank_balance = 1000;
        do{
            System.out.println("1.Check Balance");
            System.out.println("2.Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("Enter your choice: ");
            choice = scn.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Your Balance = " + Bank_balance);
                    break;

                case 2:
                    System.out.println("Enter amount to deposite : ");
                    Bank_balance += scn.nextDouble();
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw : ");
                    double amt = scn.nextDouble();

                    if(amt <= Bank_balance)
                    {
                        Bank_balance -= amt;
                        System.out.print("Amount withdraw successfully");
                        break;
                    }
                    else
                    {
                        System.out.println("Insuficient balance");
                        break;
                    }

                case 4:
                    System.out.println("Thank you !!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);

        scn.close();
    }
}
