import java.util.*;
public class sum{
    public static int calculatesum(int n){
        if(n==1){
            return 1;
        }
        
        int sum = n + calculatesum(n-1);
        return sum;
    }
    public static void main(String args[]){
     int n=5;
     System.out.println(calculatesum(n));
    }
}