class Solution 
{
    public int maxProfit(int[] prices) 
    {
        //initially we assume 0th index price is lowest therefore buy at 0th index
        int buy= prices[0];
        int profit=0;
        
        for(int i=1; i<prices.length; i++)
        {
            //if further we get higher prices then we sell(price[i]-buy) at highest price and get profit
            if(prices[i]>buy)
                profit= Math.max(profit, prices[i]-buy);
            else
                //if further we get a lower price then 0th index update buy
                buy=prices[i];
        }
        return profit;
    }
}