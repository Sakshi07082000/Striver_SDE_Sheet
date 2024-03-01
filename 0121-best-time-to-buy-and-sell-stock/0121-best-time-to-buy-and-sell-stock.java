class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int maxprofit=0;                      //initially profit is zero
        int buy=prices[0];                   //let price at 0th index be min at which we buy 
        for(int i=1; i<prices.length; i++)
        {
            // 
            int profit= prices[i]-buy;
            maxprofit= Math.max(maxprofit, profit);
            buy= Math.min(buy, prices[i]);
        }
        return maxprofit;
    }
}