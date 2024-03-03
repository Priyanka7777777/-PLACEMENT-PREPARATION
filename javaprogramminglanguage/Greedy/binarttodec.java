import java.util.*;
public class binarttodec{
    public static int bintodec(int binarynum){
        int n = binarynum;
        int pow = 0;
        int decimal = 0;
        while(n>0){
            int lastdigit = n%10;
            decimal = decimal + lastdigit*(int)Math.pow(2,pow);
            pow++;
            n = n/10;
            
        }
        System.out.println("the decimal number of "+ binarynum + "is"+ decimal);
    }
    public static void main(String args[]){
        int binarynum = 111;
       


    }
    System.out.println( bintodec(binarynum));
}