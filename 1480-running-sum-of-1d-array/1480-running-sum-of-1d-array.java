class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int var=0;
        if(nums.length==1)
        {
            sum[0] = sum[0]+nums[0];
            return sum;
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                var = var+nums[i];
                sum[i] = var;
            }
        }
        return sum;
    }
}