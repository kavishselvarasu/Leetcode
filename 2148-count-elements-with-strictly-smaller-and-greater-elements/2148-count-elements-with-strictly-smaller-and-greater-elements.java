class Solution {
    public int countElements(int[] nums) {
        int l = nums.length;
        int n = 0;
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < l; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] > min && nums[i] < max) {
                n = n + 1;
            }
        }
        return n;
    }
}