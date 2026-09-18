class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        for(int i=0; i< prices.length-1; i++){
            int r = prices.length-1;
            while(i<r){
                if(prices[i] < prices[r]){
                    mp = Math.max(mp,prices[r] - prices[i]);
                } 
                r--;
            }
        }
        return mp;
    }
}
