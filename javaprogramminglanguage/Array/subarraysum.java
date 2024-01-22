import java.util.*;

public class subarraysum {
    public static void sum(int[] arr) {
        int totalcount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0; // Move the sum initialization inside the second loop
                // priniting subarray

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                  
                System.out.println();
            }
            totalcount++;
            System.out.println();
        }
        
        
    }
    System.out.println("Total number of subarrays: " + totalcount);
    }
    public static void main(String args[]) {
        int[] arr = { 1, 2, 34, 5, 7, 8 };
        sum(arr);
    }
}
