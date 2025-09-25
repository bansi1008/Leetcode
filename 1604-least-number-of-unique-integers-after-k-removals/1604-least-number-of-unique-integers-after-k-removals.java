class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer,Integer> freq=new HashMap<>();

        for(int n:arr){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

       List<Integer> freqs = new ArrayList<>(freq.values());

        
        Collections.sort(freqs);

        int unique = freqs.size();

        for(int freqv : freqs){
            if (k >= freqv) {
                k -= freqv;   
                unique--; 
            }
            else{
                break;
            }
        }  
        return unique;
    }
}