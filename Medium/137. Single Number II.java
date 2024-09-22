class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int num=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if((num!=nums[i]) && (count==0))
            {
                return num;
            }
            else if(num==nums[i])
            {
                count++;
            }
            else
            {
                num=nums[i];
                count=0;
            }
        }
        return num;
    }
}
