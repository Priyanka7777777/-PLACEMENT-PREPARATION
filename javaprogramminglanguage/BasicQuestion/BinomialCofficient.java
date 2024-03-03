import java.util.*;
public class BinomialCofficient{
public static int factorial(int n){
    int f =1;
    for(int i = 1; i<=n;i++){
        f=f*i;
        }
    return f;
    }
public static int Bincoff(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int coeff= a/b*c;
        return coeff;
    }
public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(Bincoff(n,r));


    }
}