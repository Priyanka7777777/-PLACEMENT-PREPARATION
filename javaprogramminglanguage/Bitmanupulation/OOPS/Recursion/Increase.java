import java.util.*;
public class Increase{
    public static void PrintDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n + " ");
        PrintDec(n-1);

    }
    
    public static void Printinc(int n){
        
        if(n==0){
            return;
        }

        Printinc(n-1);
        System.out.println(n + " ");
        

    }

public static void main(String args[]){
int n = 10;
System.out.println("Number in increaseing order:");
Printinc(n);
System.out.println("Number in Decreaseing order:");
PrintDec(5);

}
}