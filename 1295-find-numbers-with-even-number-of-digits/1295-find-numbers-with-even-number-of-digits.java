class Solution {
    public int findNumbers(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            int c = 0;
            while(nums[i]>0)
            {
                nums[i] = nums[i]/10;
                c=c+1;
            }
            if(c%2==0)
            {
                s=s+1;
            }
        }
        return s;
    }
}