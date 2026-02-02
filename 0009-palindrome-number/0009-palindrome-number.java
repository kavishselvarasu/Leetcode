class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;
        int digit;
        if(x<0)
        {
            return false;
        }
        else
        {
        while(x>0)
        {
            digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        if(reversed==original)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    }
}