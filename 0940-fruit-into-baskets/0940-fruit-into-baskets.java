class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int window=0;
        int res=0;
                
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int r=0;r<fruits.length;r++){
            freqMap.put(fruits[r],freqMap.getOrDefault(fruits[r],0)+1);

            while(freqMap.size()>2){
                 freqMap.put(fruits[l],freqMap.get(fruits[l])-1);
                 if(freqMap.get(fruits[l])==0){
                    freqMap.remove(fruits[l]);

                 }
                   l++;

            }
            res=Math.max(res,r-l+1);

        }


         
            
        return res;


        
    }
}