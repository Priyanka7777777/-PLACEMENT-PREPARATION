
//Bubble sort
import java.util.*;
import java.util.Scanner;
public class bubblesort{
    public static void sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  int[]arr = new int[10];
  System.out.println("enter the size of array");
  int n = input.nextInt();
  
  System.out.println("enter the element in an array");
  for(int i =0;i<n;i++){
    arr[i]=input.nextInt();
  }
  System.out.println("Array element are:");
    for(int i =0;i<n;i++){
        System.out.println(arr[i]);
    }
    //for outer loop to sortout the n no.of bubble and last one is sorted itself so y n-1
    for(int i=0;i<arr.length-1;i++){
        //for sorted elements, the last one first got sorted then in 2nd iteration two got sorted so on so y n-i-1
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
            }
        }
    }
    System.out.println("the sorted array is:");
     sorting(arr);
  }
    }
//time complexity= o(n^2)
