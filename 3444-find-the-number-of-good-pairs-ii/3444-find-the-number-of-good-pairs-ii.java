class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> nm = new HashMap<>();
        for(int i : nums2)
        {
            int val = i * k;
            nm.put(val, nm.getOrDefault(val, 0) + 1);
        }
        long c=0;
        for(int i : nums1)
        {
            for(int j=1;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    if(nm.containsKey(j))
                    {
                        c += nm.get(j);
                    }
                    int val=i/j;
                    if(j!=val && nm.containsKey(val))
                    {
                        c += nm.get(val);
                    }
                }
            }
        }
        return c;
    }
}