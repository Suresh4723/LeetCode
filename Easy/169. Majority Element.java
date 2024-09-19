class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2) {
            return nums[0];
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            
                if (nums[i] == nums[i - 1]) {
                    if(count==0)
                    {
                        count=2;
                         
                    }
                    else
                    {
                        count++;
                    }

                    if (count > nums.length / 2) {
                        return nums[i];
                    }
                }
            
            else
            {
                 count++;
            }

        }
        return 0;
    }
}
