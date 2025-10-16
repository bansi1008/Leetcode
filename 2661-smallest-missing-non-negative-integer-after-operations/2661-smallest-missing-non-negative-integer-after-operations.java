class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer,Integer> freq=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int x=((nums[i]%value)+value)%value;
            freq.put(x,freq.getOrDefault(x,0)+1);

        }

        int min=0;
        while(true){
            int m=min%value;

            if(!freq.containsKey(m) || freq.get(m)==0 ) break;
            freq.put(m, freq.get(m) - 1);
            min++;
        }

return min;
        
    }
}