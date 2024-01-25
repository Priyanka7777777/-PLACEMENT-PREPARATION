import java.util.*;
public class updatebits{
    public static int setbit(int i,int n){
        int bitmask =1<<i;
        return (n|bitmask);
     }
     public static int clearbit(int i,int n){
        int bitmask=~(1<<i);
        return n&bitmask;
     }
    public static int updatebit(int i, int n,int newbit){
            if(newbit==0){
            return clearbit(n,i);
        }
        return setbit(n,i);
    }
    public static void main(String args[]){
        System.out.println("update 2 bit of 32 with 4 :"+ updatebit(2,32,4));
        System.out.println("update 2 bit of 2 with 0 :"+ updatebit(2,2,0));

    }
}