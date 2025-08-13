class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] a=new int[arr1.length];
        int index=0;
              Map<Integer, Integer> m = new HashMap<>(); 
        for(int i:arr1){
            m.put(i,m.getOrDefault(i,0)+1);

        }
        for(int j:arr2){
            int f=m.getOrDefault(j,0);
            for(int i=0;i<f;i++){
                a[index++]=j;

            }
            m.remove(j);
        }

        List<Integer> remaining = new ArrayList<>(m.keySet());
Collections.sort(remaining);

     for(int num:remaining){
       int freq = m.get(num); 
    for(int i = 0; i < freq; i++){
        a[index++] = num;
    }

}
return a;
        
    }
}