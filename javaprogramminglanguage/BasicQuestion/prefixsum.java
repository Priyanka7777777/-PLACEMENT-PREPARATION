import java.util.*;
public class prefixsum{
    public static void sum(int []arr){
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        //calculate prefix array
        for(int i =1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
            }
        for(int i =0;i<arr.length;i++){
            int start = i;
            for (int j =i;j<arr.length;j++){
               int  end = j;
                //since arr index is never zero and  start value is '0'hence prefix[-1] is never a index,it will give error 
                currsum= start==0?prefix[end]: prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;

                }

                }
            }
        System.out.println("max sum:"+maxsum);
    }
    public static void main(String args[]){
int arr[]={1,6,9,3,0,-1,3};
sum(arr);
    }
}