class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> h=new HashMap<>();
        int[] ar=new int[k];
        
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            h.put(num,h.getOrDefault(num,0)+1);

            


            

        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(h.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < k; i++) {
            ar[i] = list.get(i).getKey();
        }



        return  ar;
    }
}