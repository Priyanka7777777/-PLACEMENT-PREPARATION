public class binarysearch {
    public static int search(int num[],int key){
        int start = 0;
        int end = num.length-1;
     
        while(start<=end){
            int mid = start+(end-start)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start = mid+1;
            }
            else{
                end =  mid-1;
            }
        }
       return -1;
    }
    public static void main (String args[]){
        int num []= {12,23,90,67,23};
        int key = 23;
        System.out.println("index at:" + search(num,key));
    }
}
