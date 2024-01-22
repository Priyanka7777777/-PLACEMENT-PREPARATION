import java.util.*;
public class kadane{
    public static void sum(int[]arr){
        int maximumsum=Integer.MIN_VALUE,currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            if(maximumsum<currentsum){
                maximumsum=currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }
        }
System.out.println("maximum sum is:"+ maximumsum);
    }
    
    public static void main(String ags[]){
int arr[]={-9,-2,-4,-7};
sum(arr);

    }
}