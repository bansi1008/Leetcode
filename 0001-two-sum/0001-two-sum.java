class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n=nums.length;

        Map<Integer,Integer> h=new HashMap<>();


       for(int i=0;i<n;i++){
            int c=target-nums[i];
            if(h.containsKey(c)){
                return new int[] {h.get(c),i};
            }
            h.put(nums[i],i);
        }
        
     return new int[] {0,0};
        }
        
        
    }
