import java.util.*;
public class oddeven{
    public static void odd(int n){
        int bitmask= 1;
        //seeing last digit is 1 or 0; o->even,1->odd
        if ((n&bitmask)==0){
            System.out.println("even");

        }
        System.out.println("odd");
    }
    public static void main(String args[]){
       int n =3;
      odd(n);
    }
}