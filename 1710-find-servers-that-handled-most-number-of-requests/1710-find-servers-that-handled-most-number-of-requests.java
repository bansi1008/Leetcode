class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        TreeSet<Integer> free = new TreeSet<>();
                int[] c = new int[k];

        for(int i=0;i<k;i++) free.add(i);

        for(int i=0;i<arrival.length;i++){
            while (!pq.isEmpty() && pq.peek()[0] <= arrival[i]) {
                int[] finished = pq.poll();
                free.add(finished[1]);
            }
             if (free.isEmpty()) continue;
             int pre=i%k;
             Integer  serv=free.ceiling(pre);
             if(serv == null) serv=free.first();

             free.remove(serv);
             pq.add(new int[]{arrival[i]+load[i],serv});
             c[serv]++;
        }
    int max=0;
  
  for(int ch:c){
    max=Math.max(max,ch);
  }
  List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (c[i] == max)res.add(i);
        }
        return res;

    }
}