class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        int count = 0;
        while(i < nums.length && j < nums.length) {
            if(nums[i] != val) {
                count++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return count;
    }
}