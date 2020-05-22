class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int val = map.get(s.charAt(i));
                map.put(s.charAt(i), ++val);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(o1.getValue() < o2.getValue()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        String req = new String();
        for(Map.Entry<Character, Integer> arr : list) {
            int n = arr.getValue();
            for(int i = 0; i < n; i++) {
                req += Character.toString(arr.getKey());
            }
        }
        return req;
    }
}