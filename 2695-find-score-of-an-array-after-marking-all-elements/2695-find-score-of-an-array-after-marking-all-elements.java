class Solution {
    public long findScore(int[] nums) {
            int n=nums.length;
            long ans=0;
        boolean[] m=new boolean[n]; 
       PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

       for(int i=0;i<n;i++){
        pq.add(new int[]{nums[i],i});
       }

       while(!pq.isEmpty()){
        int[] b=pq.poll();
        int val=b[0];
        int index=b[1];

        if(m[index]==true) continue;

        ans+=val;
        m[index]=true;
        if(index+1<n) m[index+1]=true;
        if(index-1>=0) m[index-1]=true;
       }
    return ans;

    }
}