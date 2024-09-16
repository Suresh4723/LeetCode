class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> al=new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return al;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }

        for(int j=i+1;j<nums.length-2;j++)
        {
            if(j>i+1 && nums[j]==nums[j-1])
            {
                continue;
            }
            int k=j+1;
            int l=nums.length-1;
            while(k<l)
            {
                long total = (long)nums[i]+nums[j]+nums[k]+nums[l];
                if(total<target)
                {
                    k++;
                }
                else if(total>target)
                {
                    l--;
                }
                else
                {
                    al.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    k++;
                    l--;
                    while(nums[k]==nums[k-1] && k<l)
                    {
                        k++;
                    }
                    while(nums[l]==nums[l+1] && k<l)
                    {
                        l--;
                    }
                }
            }
        }
        }
        return al;
    }
}
