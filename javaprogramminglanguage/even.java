import java.util.*;
public class even{
    public static boolean iseven(int n){
        if (n%2==0){
            return true;
        }
       return false;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(iseven(n));

        // for checking if the code is working properly or not.
         if (iseven(12)){
            System.out.println("working fine");
         }
         else{
            System.out.println("not working");
         }

    }
}