class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int x1 = 0;
        int x2 = 0;
        int max = 0;
        while(x2 < s.length()) {
            if(set.contains(s.charAt(x2))) {
                set.remove(s.charAt(x1));
                x1++;
            } else {
                set.add(s.charAt(x2));
                max = Math.max(max, set.size());
                x2++;
            }
        }
        for(Character ch : set) {
            System.out.println(ch);
        }
        return max;
    }
}