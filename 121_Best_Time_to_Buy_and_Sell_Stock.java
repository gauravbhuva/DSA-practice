class Solution {
    public int maxProfit(int[] prices) {
        int i,j;
        int profit =0;
        int maxp=0;
        for(i=prices.length-1 ;i>0;i--){
            for(j=i-1;j>=0;j--){
                profit = prices[i]-prices[j];
                if(profit>maxp){
                    maxp=profit;
                }
        }
        }
        return maxp;
    }
}
