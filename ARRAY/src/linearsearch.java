import java.util.*;
public class linearsearch{
    public static int linearSearch(int num[],int key){
        for(int i = 0; i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int linear(String arr[],String key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int[] num= {10,12,90,40};
        String []arr = {"apple","man","samosa"};
        int key = 10;
        String k = "apple";
       int index = linearSearch(num,key);
       int idx = linear(arr, k);
       if(index == -1){
        System.out.println("Not Found");
       }
else{
    System.out.println("number found at " + index);
}
if(idx== -1){
    System.out.println("Not Found");
   }
else{
System.out.println("number found at " + idx);
}
}
}