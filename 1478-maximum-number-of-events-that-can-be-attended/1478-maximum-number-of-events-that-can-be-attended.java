class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
                PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n=events.length;
        int day=0;
        int j=0;
        int i=0;
       int maxd = 0;
       int attended=0;

       for (int[] e : events) maxd = Math.max(maxd, e[1]);
        for(i=1;i<=maxd;i++){
            while(j<n && events[j][0]==i){
                pq.offer(events[j][1]);
                j++;
            }

            while(!pq.isEmpty()&&pq.peek()<i){
                pq.poll();
            }
            if (!pq.isEmpty()) {
                pq.poll();
                attended++;
            }

        }

return attended;
        
    }
}