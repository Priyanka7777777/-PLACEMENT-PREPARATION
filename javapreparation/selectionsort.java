//selection sort
import java.util.*;
import java.util.Scanner;
public class selectionsort{
    public static void sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+"");
    }
    System.out.println();
}
    public static void main(String[] args){
   int i ,j ;
        Scanner input = new Scanner(System.in);
            
            System.out.println("the length of the array");
            int n = input.nextInt();
            int []arr = new int[n];
            System.out.println("Enter the element in array:");
            for( i =0;i<n;i++){
                arr[i]=input.nextInt();

            }
            System.out.println("the element in array are:");
            for(  i= 0;i<n;i++){
                System.out.println(arr[i]);
            }
            //the outter loop run for n-1 times
for(i=0;i<arr.length-1;i++){
    int smallest=i;
    //inner loop run with comparission with the next number and goes till n
    for(j= i+1;j<arr.length;j++){
        if(arr[smallest]>arr[j]){
            smallest = j;
        }


    }
     int temp= arr[smallest];
     arr[smallest]=arr[i];
     arr[i]=temp;

}
System.out.println("The sorted arraay is:");
sorting(arr);
        }
    }
//note: Make sure to see which variable you are keeping in loop in case of wrong variable it will give error of exceptional bounded.
