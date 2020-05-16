class Solution {
    public String convert(String s, int numRows) {
        HashMap<Integer, StringBuilder> map = new HashMap<>();
        int pos = 1;
        boolean inc = true;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(pos == numRows) {
                inc = false;
            }
            if(pos == 1) {
                inc = true;
            }
            if(map.containsKey(pos)) {
                StringBuilder str = map.get(pos);
                map.put(pos, str.append(ch));
            } else {
                StringBuilder str = new StringBuilder();
                map.put(pos, str.append(ch));
            }
            if(inc) {
                pos++;
            } else {
                pos--;
            }
        }
        StringBuilder new_s = new StringBuilder();
        for(Integer key : map.keySet()) {
            new_s.append(map.get(key));
        }
        return new_s.toString();
    }
}