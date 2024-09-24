class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        int gap=0;
        for (int i = 1; i < nums.length; i++) {
            int currentgap=nums[i] - nums[i - 1];
            if(currentgap>gap)
            {
                gap=currentgap;
            }
        }
        return gap;
    }
}
