import java.util.*;
public class reverserarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter element in an array:");
        for(int i= 0;i<n;i++){
            System.out.println(" element "+i+" is:");
            arr[i] = sc.nextInt();    
        }
        System.out.println("Array before reversing:"+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("array after reversing:"+Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
int start = 0;
int end = arr.length-1;
//swaping of numbers
while(start<end){
    int temp = arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
}

    }
}