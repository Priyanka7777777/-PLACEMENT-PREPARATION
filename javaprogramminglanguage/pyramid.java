import java.util.*;
public class pyramid{
    public static int claculate(int num1, int num2){
        
        int sum = num1+num2;
        return sum;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");

        int a = sc.nextInt();
        System.out.println("enter the second number:");
        
        int b= sc.nextInt();
        int sum = claculate(a,b);
       System.out.println("sum of number: "+sum);
        
        
    }
}