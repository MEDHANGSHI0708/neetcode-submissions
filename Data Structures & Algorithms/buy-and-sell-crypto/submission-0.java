class Solution {
    public int maxProfit(int[] prices) {

        int maxprofit=0;
        int profit=0;
        int n=prices.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]>=prices[i]){
                    profit=prices[j]-prices[i];
                    

                    maxprofit=Math.max(profit,maxprofit);
                }
            }
        }
        return maxprofit;
        
    }
}
