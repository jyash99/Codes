class Solution {
    public int maxArea(int[] h) {
        int left = 0;
        int right = h.length - 1;
        int max = 0;
        while(left < right) {
            int num = Math.min(h[left], h[right]);
            int area = num * (right - left);
            if(area > max) {
                max = area;
            }
            left++;
            right--;
        }
        return max;
    }
}