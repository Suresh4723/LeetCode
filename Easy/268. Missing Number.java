class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int finalsum=n*(n+1)/2;
        int currentsum=0;
        for( int var : nums)
        {
            currentsum+=var;
        }
        return finalsum-currentsum;
    }
}
