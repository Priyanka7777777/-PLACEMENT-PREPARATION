import java.util.*;
public class buysell{
    public static int buyAndSellStocks(int[] price){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){//profit
                int profit=price[i]-buyprice;//today's profit
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=price[i];
            }

        }
        return maxprofit;
    }
    public static void main(String args[]){
int prices[]={1,2,4,2,8};
System.out.println(buyAndSellStocks(prices));
    }
}