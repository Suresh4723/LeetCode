class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mmid=m-1;
        int nmid=n-1;
        int mlast=m+n-1;
        while(nmid>=0)
        {
            if(mmid>=0 && nums1[mmid]>nums2[nmid])
            {
                nums1[mlast]=nums1[mmid];
                mmid--;
            }
            else
            {
                nums1[mlast]=nums2[nmid];
                nmid--;

            }
            mlast--;

        }
    }
}
