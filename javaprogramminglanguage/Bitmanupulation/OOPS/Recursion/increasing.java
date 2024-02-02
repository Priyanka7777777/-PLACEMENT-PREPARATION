import java.util.*;
public class increasing{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+"") ;
        printDec(n-1);
    }
    public static void printincreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printincreasing(n-1);
        System.out.println(n+"") ;
        
    }
    
    public static void main (String args[]){
       int n= 20;
        printincreasing(n);
    }
}