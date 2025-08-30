class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> largest = new PriorityQueue<>();
        for(int i:nums){
            largest.offer(i);
            if(largest.size()>k) largest.poll();
        }
        return largest.peek();

        
    }
}