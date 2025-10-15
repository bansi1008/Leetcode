class Solution {
    public int getKth(int lo, int hi, int k) {
        int n=(hi-lo)+1;

         PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
         Map<Integer, Integer> cache = new HashMap<>();

         for(int i=lo;i<=hi;i++){
            int c=0;
            int val=i;
            while(val!=1){
                if(cache.containsKey(val)){
                    c+=cache.get(val);
                    break;
                }
               if(val%2==0){
                val /=2;
                c++;
               }
               else{
                val=val*3+1;
                c++;
               }
            }
            cache.put(i,c);
            pq.add(new int[]{i,c});
         }

            int j=0;
            int curr=0;
            while(j < k) {
    int[] v = pq.poll();
    curr = v[0];
    j++;
}
            return curr;
    }
}