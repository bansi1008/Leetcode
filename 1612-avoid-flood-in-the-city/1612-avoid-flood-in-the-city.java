class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] ans=new int[rains.length];

        Map<Integer, Queue<Integer>> a = new HashMap<>();

        for(int i=0;i<rains.length;i++){

            if(rains[i]>0){
            a.putIfAbsent(rains[i],new LinkedList<>());
            a.get(rains[i]).offer(i);
            }
        }
        Set<Integer> b = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((i, j) -> i[0] - j[0]);

        for(int i=0;i<rains.length;i++){
            if(rains[i]>0){
                a.get(rains[i]).poll();

                if(b.contains(rains[i])){
                    return new int[0];
                }
                b.add(rains[i]);
                ans[i]=-1;
                if(!a.get(rains[i]).isEmpty()){
                    int n=a.get(rains[i]).peek();
                    pq.offer(new int[]{n,rains[i]});
                }
            }
            else{
                if(!pq.isEmpty()){
                    int[] p=pq.poll();
                    int l=p[1];
                    b.remove(l);
                    ans[i]=l;
                }
                else{
                    ans[i]=1;
                }
            }
        }


        return ans;
    }
}