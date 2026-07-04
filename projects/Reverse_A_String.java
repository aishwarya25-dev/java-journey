// Reverse a String with O(n) complexity

import java.util.Scanner;

public class Reverse_A_String {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String word = scn.nextLine();

        char[] chars = word.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while(left < right)
        {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reverse of the word : " + new String(chars));
        scn.close();
        
    }
    
}
