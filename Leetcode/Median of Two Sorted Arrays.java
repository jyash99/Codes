class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] nums3 = new double[nums1.length + nums2.length];
        int index = 0;
        for(int i = 0; i < nums1.length; i++) {
            nums3[index++] = (double)nums1[i]; 
        }
        for(int i = 0; i < nums2.length; i++) {
            nums3[index++] = (double)nums2[i];
        }
        Arrays.sort(nums3);
        return (nums3.length % 2 == 0) ? (nums3[nums3.length / 2] + nums3[nums3.length / 2 - 1]) / 2 : (nums3[((nums3.length + 1) / 2) - 1]);
    }
}