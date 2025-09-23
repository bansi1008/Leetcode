class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int min=prices[0];

        for(int i=1;i<prices.length;i++){
             if(prices[i]<min){
                min=prices[i];
             }
             else if(prices[i]>min){
                pro+=prices[i]-min;
                min=prices[i];
             }
        }
        return pro;
    }
}