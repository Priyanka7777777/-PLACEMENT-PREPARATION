public class subarray {
    public static void array(int arr[]){
        
        int maxsum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            
            for(int j = i;j<arr.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                    sum+=arr[k];
                }
              
                System.out.println(" : sum of subarray is:"+ sum);
                if(sum>maxsum){
                    maxsum = sum;
                }

            }
            System.out.println();
    }
        System.out.println("maxisum of an array :"+maxsum);
        
    }
    public static void main (String args[]){
        int arr[]={1,8,3,10,3};
        array(arr);
    }
}
