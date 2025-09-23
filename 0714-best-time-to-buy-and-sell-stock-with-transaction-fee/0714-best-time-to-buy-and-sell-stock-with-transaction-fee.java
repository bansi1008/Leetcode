class Solution {
    public int maxProfit(int[] prices, int fee) {
        int min=prices[0];
        int pro=0;

        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
            min= prices[i];
            }
            else if(prices[i]>min+fee){
                pro+=prices[i]-min-fee;
                min=prices[i]-fee;
            }
        }
        return pro;
    }
}