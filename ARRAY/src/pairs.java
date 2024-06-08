public class pairs {
    public static void  Paris(int arr[]){
        int tp = 0;
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            for(int j = i+1; j<arr.length;j++){
 System.out.print("("+ curr+","+ arr[j]+ ")");
      tp++;      
}
            System.out.println();
        }
System.out.println("total pairs =" + tp);
    }
    public static void main (String args[]){
        int arr[] = {1,2,6,9,2,20};
        Paris(arr);

    }
    
}
