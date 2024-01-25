import java.util.*;
public class countsetbit{
    public static int countbit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
System.out.println("count of 1 in 112: "+countbit(112));
    }
}