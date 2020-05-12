class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                map.put(nums[i], ++val);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        for(Integer key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }
}