class Solution {
    public void reverseString(char[] s) {
        char[] a = new char[s.length];
        int n = s.length-1;
        for(int i=n;i>=0;i--)
        {
            a[n-i] = s[i];
        }
        for(int i=0;i<=n;i++)
        {
            s[i]=a[i];
        }
    }
}