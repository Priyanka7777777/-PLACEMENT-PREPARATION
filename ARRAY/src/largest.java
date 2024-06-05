import java.util.*;
public class largest {
    public static int Largest(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main (String args[]){
        int arr[]={1,2,5,6,10};
        int large = Largest(arr); 
        System.out.println("the largest number is "+ large );

    }
}
