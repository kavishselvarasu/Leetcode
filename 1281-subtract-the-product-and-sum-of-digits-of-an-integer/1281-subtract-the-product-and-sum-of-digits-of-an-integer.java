class Solution {
    public int subtractProductAndSum(int n) {
        int s = 0;
        int p = 1;
        int r;
        while(n!=0)
        {
            r = n%10;
            s += r;
            p *= r;
            n /= 10;
        }
        return p - s;
    }
}