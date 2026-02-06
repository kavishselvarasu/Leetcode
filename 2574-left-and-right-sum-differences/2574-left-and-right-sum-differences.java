class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        if(nums.length == 1)
        {
            ans[0] = 0;
            return ans;
        }
        else
        {
        int[] ls = new int[nums.length];
        int[] rs = new int[nums.length];
        ls[0] = 0;
        rs[nums.length-1] = 0;
        int sum = 0;
        int var1 = 0;
        int var2 = 0;
        int i;
        for(i = 0;i < nums.length;i++)
        {
            var1 = var1 + nums[i];
            ls[i] = ls[i] + var1;
        }
        for(i = nums.length-1;i >= 0;i--)
        {
            var2 = var2 + nums[i];
            rs[i] = rs[i] + var2;
        }
        for(i = 0;i<nums.length;i++)
        {
            ans[i] = Math.abs(ls[i] - rs[i]);
        }
        }
        return ans;
    }
}