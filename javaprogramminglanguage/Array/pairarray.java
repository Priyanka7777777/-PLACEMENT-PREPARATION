import java.util.*;
public class pairarray{
    public static void pair(int[]arr){
        //totalcount in array
        int totalcount=0;
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
    for(int j = i+1;j<arr.length;j++){
System.out.print("("+ curr+ "," + arr[j]+")");
totalcount++;
}

System.out.println( );
        }
        System.out.println("totalcount is:"+totalcount);
    }
    public static void main(String args[]){
int [] arr = {1,4,2,6,8,9};
pair(arr);
    }
}