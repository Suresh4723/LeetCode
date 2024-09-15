class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int currentcloset = nums[i] + nums[j] + nums[k];
                if (Math.abs(currentcloset - target) < Math.abs(closet - target)) {
                    closet = currentcloset;
                }
                if (currentcloset == target) {
                    return currentcloset;
                }
                if (currentcloset < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closet;
    }
}
