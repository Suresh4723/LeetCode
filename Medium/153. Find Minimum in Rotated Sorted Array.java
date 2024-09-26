class Solution {
    public int findMin(int[] nums) {
        int Min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            Min=Math.min(Min,nums[i]);
        }
        return Min;
    }

}
