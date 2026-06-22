// Count Down 

import java.util.Scanner;

public class CountDown {
    
    public static void number(int num)
    {
      if(num > 0)
      {
        System.out.println(num + " ");
        number(num - 1);
      }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scn.nextInt();

        number(num);

        scn.close();
       
    }
}
