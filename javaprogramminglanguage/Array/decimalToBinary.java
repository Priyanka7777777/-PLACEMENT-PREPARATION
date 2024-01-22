import java.io.*;
import java.lang.*;
import java.util.*;
public class decimalToBinary{
    public static void dtb(int num){
        int temp= num;
        int pow=0;
        int lastdigit=0;
        int binary =0;
        while(temp>0){
            lastdigit= temp%2;
            binary = binary + (lastdigit*(int)Math.pow(10,pow));
            pow++;
            temp= temp/2;
        }
System.out.println("decimal to binary of "+num+ " is: "+ binary);
    }
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
dtb(num);

}
}