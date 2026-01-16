// FIRST SOLUTION THAT CAME IN MIND BUT IT HAS LARGE TIME COMPLEXITY
// class Solution {
//     public int maxProfit(int[] prices) {
//         int i,j;
//         int profit =0;
//         int maxp=0;
//         for(i=prices.length-1 ;i>0;i--){
//             for(j=i-1;j>=0;j--){
//                 profit = prices[i]-prices[j];
//                 if(profit>maxp){
//                     maxp=profit;
//                 }
//         }
//         }
//         return maxp;
//     }
// }


class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit , maxp=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            profit =prices[i]-buy;
            if(profit>maxp){
                maxp=profit;
            }
        }
        return maxp;
    }
}
