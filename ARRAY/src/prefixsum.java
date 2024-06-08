public class prefixsum {
    public static void sum(int arr[]){
        int currsum = 0;
        int maxisum = Integer.MIN_VALUE;
        int prefixsum [] = new int[arr.length];
        //calculate prefix sum
        for(int i = 0;i<prefixsum.length;i++){
            prefixsum[i] = i==0 ? arr[i]:prefixsum[i-1]+arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            int start =i;
            for (int j = i;j<arr.length;j++){
                int end = j;
              currsum = start== 0 ?prefixsum[i]: prefixsum[end]-prefixsum[start-1] ;
              if(maxisum<currsum){
                maxisum=currsum;
              }  

            }
        }
        System.out.println("max sum ="+ maxisum);
    }

   
public static void main(String args[]){
    int arr[]={1,3,5,7};
    sum(arr);

}
    
}
