import java.util.*;
public class kadane{
    public static void sum(int[]arr){
       
        int maximumsum=Integer.MIN_VALUE,currentsum=0;
        int start=0; int end = 0; int s =0;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            if(maximumsum<currentsum){
                maximumsum=currentsum;
                start = s;
                end = i;
            }
            if(currentsum<0){
                currentsum=0;
                s= i+1;
            }
            //if(maximumsum<0){
            //    maximumsum = 0;
            //}
        }
System.out.println("maximum sum is:"+ maximumsum);

        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
    
    public static void main(String ags[]){
int arr[]={-9,-2,-4,-7};
sum(arr);

    }
}