public class reversearray {
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[] = {2,5,4,2,3,8};
        reverse(arr);
        System.out.println("reverse of the array is:");
        for(int i = 0;i<arr.length;i++){
 System.out.print(arr[i] + " ");
        }
  System.out.println();
    }
}
