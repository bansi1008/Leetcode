class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int w=n-k;
   int sum=0;
        for(int i:cardPoints){
            sum+=i;

        }
        int min=0;
        int curr=0;
        for(int i=0;i<w;i++){
            curr+=cardPoints[i];
        }

        int wmin=curr;
        for(int i=w;i<n;i++){
            curr=curr+cardPoints[i]-cardPoints[i-w];
            wmin=Math.min(wmin,curr);
        }

        return sum-wmin;
    }
}