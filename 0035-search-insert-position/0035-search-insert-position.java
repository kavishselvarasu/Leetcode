class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int ans = 0;
        while(i<=nums.length-1)
        {
            if(nums[i]==target)
            {
                ans = i;
                break;
            }
            else if(i<nums.length-1 && nums[i]<=target && nums[i+1]>=target)
            {
                ans = i+1;
                break;
            }
            else if(target<nums[0])
            {
                ans = 0;
            }
            else
            {
                ans = nums.length;
            }
            i++;
        }
        return ans;
    }
}