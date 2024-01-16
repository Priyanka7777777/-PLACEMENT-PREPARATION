import java.util.*;
public class conditional{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int num1= sc.nextInt();
       
        if(num1<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("positive");

        }
        


    }
}