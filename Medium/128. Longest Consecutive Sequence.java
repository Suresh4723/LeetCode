class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }

        int longestseq = 1;
        int currentseq = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                currentseq++;
                longestseq = Math.max(longestseq, currentseq);
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {

                currentseq = 1;

            }
        }
        return longestseq;
    }
}
