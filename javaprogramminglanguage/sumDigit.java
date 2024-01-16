import java.util.*;

public class sumDigit{
public static int Sum(int num){
    int sum=0;
    int rem = 0;
    while(num!=0){
        
        sum= sum+ (num%10);
        num = num/10;
    
    }
    return sum;
    
    }

public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("sum of num :"+ Sum(number));

}}