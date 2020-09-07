class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }

        int min = prices[0];
        int accPro = 0;

        int profit = 0;

        for(int i=1; i<prices.length; i++){
            profit = Math.max(profit, prices[i]-min);
            min = Math.min(min, prices[i]);
            if(profit>0){
                accPro= accPro+profit;
                profit=0;
                min=prices[i];
            }
            
        }

        return accPro;
        
    }
}
