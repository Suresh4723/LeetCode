class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<n;i++)
        {
            if(buy<prices[i])
            {
                profit+=prices[i]-buy;

            }
        buy=prices[i];
        }
    return profit;
    }
}
