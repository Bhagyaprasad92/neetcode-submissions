class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        System.out.println(mp);
        for(int i = 0; i < nums.length; i++) {
            if(mp.get(nums[i]) > 1) {
                return true;
            }
        }
        return false;
    }
}