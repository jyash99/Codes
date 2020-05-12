class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) {
            return 1;
        }
        if(s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(map.containsKey(ch[i])) {
                int val = map.get(ch[i]);
                map.put(ch[i], ++val);
            } else {
                map.put(ch[i], 1);
            }
        }
        int count = 0;
        int max = 0;
        Character my_key = '0';
        for(Character key : map.keySet()) {
            if(map.get(key) % 2 == 0) {
                count += map.get(key);
            } else {
                if(max < map.get(key)) {
                    max = map.get(key);
                    my_key = key;
                }
            }
        }
        for(Character key : map.keySet()) {
            if(key == my_key) {
                count += max;
            } else if(map.get(key) % 2 != 0) {
                count += (map.get(key) - 1);
            }
        }
        return count;
    }
}