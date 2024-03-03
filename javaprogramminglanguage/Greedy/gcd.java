import java.util.*;
public class gcd{
    public static int GCD(int  a, int b){
        if(b!=0){
            return GCD (b,a%b);
        
        }
        else {
            return a;
        }
    }
    public static void main(String args[]){
int a = 2;
int b = 3;
 int result = GCD(a,b);
 System.out.println(result);
    }
  
}