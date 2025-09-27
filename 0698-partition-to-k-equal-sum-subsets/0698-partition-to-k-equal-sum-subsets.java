import java.util.Arrays;

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % k != 0) return false;

        int target = sum / k;

        Arrays.sort(nums);
        reverse(nums);

        int[] buckets = new int[k];
        return backtrack(nums, 0, buckets, target);
    }

    private boolean backtrack(int[] nums, int index, int[] buckets, int target) {
        if (index == nums.length) {
            for (int b : buckets) {
                if (b != target) return false;
            }
            return true;
        }

        int num = nums[index];

        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] + num <= target) {
                buckets[i] += num;
                if (backtrack(nums, index + 1, buckets, target)) {
                    return true;
                }
                buckets[i] -= num; 
            }

            if (buckets[i] == 0) break;
        }

        return false;
    }

    private void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i]; nums[i] = nums[j]; nums[j] = temp;
            i++; j--;
        }
    }

}
