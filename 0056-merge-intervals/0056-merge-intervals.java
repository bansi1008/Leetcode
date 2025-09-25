class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       int la=intervals[0][1];
       int fi=intervals[0][0];
        List<int[]> res = new ArrayList<>();

        for(int i=1;i<intervals.length;i++){
            int f = intervals[i][0];
            int l = intervals[i][1];

            if(f<=la){
                la=Math.max(l,la);
            }
            else{
                res.add(new int[]{fi,la});
                fi=f;
                la=l;
            }


        }
        res.add(new int[]{fi, la});
        return res.toArray(new int[res.size()][]);
        
    }
}