class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0) {
            return "";
        }
        if(s.length() == 1) {
            return s;
        }
        int start = 0;
        int end = 0;
        int max_length = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            ArrayList<Integer> a1 = check(s, i, i);
            ArrayList<Integer> a2 = check(s, i, i + 1);
            int len1 = a1.get(2);
            int len2 = a2.get(2);
            int len = Math.max(len1, len2);
            if(len > max_length) {
                max_length = len;
                if(len1 > len2) {
                    start = a1.get(0) + 1;
                    end = a1.get(1);
                } else {
                    start = a2.get(0) + 1;
                    end = a2.get(1);
                }
            }
        }
        return s.substring(start, end);
    }
    
    public ArrayList<Integer> check(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int len = right - left - 1;
        arr.add(left);
        arr.add(right);
        arr.add(len);
        return arr;
    }
}