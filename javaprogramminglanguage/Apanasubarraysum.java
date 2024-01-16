import java.util.*;
public class Apanasubarraysum{
    public static void subarraysum(int[] arr){
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int start=i;
            
            for(int j=i+1;j<arr.length;j++){
             int end = j;
             currsum=0;
            //printing subarray loop 
             for(int k = start; k<=end;k++){
             
                System.out.print(arr[k]+ " ");//print subarray
                currsum+=arr[k];
             }
             System.out.println( );
             System.out.println("current sum is:"+currsum);
             if(maxsum<currsum){
             maxsum= currsum;
             }
             System.out.println( );
            }
        }
        System.out.println("maxsum="+maxsum);

    }
        public static void main (String args[]){

        int arr[]= {1,-2,3,5,6,3,2,1};
        subarraysum(arr);
    }
}