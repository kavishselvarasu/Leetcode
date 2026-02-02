class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        int a = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                a *= 1;
            } else if (nums[i] < 0) {
                a *= -1;
            } else {
                a = 0;
                break;
            }
        }
        return a;
    }
}