import java.util.*;
public class setithbits{
    public static int setbit(int i,int n){
       int bitmask =1<<i;
       return (n|bitmask);
    }
    public static void main(String args[]){
System.out.println("set the 5th bit of 12:"+setbit(5,12));
    }
}