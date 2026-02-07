class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int [nums.length];
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
            nums[i] = nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++)
        {
            ans[i] = nums[i]*nums[i];
        }
        return ans;
    }
}