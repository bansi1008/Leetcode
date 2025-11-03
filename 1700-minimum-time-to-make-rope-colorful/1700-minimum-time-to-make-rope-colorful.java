class Solution {
    public int minCost(String colors, int[] neededTime) {
     
        int ans=0;
        int n=colors.length();
        int prev=neededTime[0];
        for(int i=1;i<n;i++){
            if(colors.charAt(i-1)==colors.charAt(i)){
                ans+=Math.min(prev,neededTime[i]);
                prev=Math.max(prev,neededTime[i]);
            }
            else{
            prev=neededTime[i];
            }

        }
        return ans;
    }
}