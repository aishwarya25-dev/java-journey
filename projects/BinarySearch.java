// Binary Search using bulid in java library (java.util.Arrays)

import java.util.Arrays;

public class BinarySearch {
    
    public static void main(String[] args)
    {
        int arr[] = {1,3,2,5,6,4};

        Arrays.sort(arr);

        int key = 3;

        System.out.println("The number " + key + " found at " + Arrays.binarySearch(arr, key));
    }
}
