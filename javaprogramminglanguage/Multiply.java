import java.util.*;
public class Multiply{
    public static int Mul(int a, int b){
        int multi= a*b;
        return multi;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int multi = Mul(a,b);
         System.out.println("multiple of number:" + multi);
         
    }
}