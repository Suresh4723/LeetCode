class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> al=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {


            if(al.contains(nums[i]))
            {
                return true;
            }
            al.add(nums[i]);
        }
       
    return false;
    } 
}
