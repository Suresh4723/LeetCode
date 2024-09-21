class Solution {
   public int[] twoSum(int[] nums, int target) {
      int[] solution={0,0};
      Map<Integer, Integer> solutionmap= new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
           int diff-target-nums[i];
           if(solutionmap.containsKey(diff))
           {
           return new int[]{i, solutionmap.get(diff)};
           }
           solutionmap.put(nums[i], i);
      }
      return null;
   }
}
