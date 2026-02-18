class Solution {
    public boolean hasAlternatingBits(int n) {
        String a = Integer.toBinaryString(n);
        if(a.length()==0||a.length()==1)
        {
            return true;
        }
        for(int i=1;i<a.length();i++)
        {
            if(a.charAt(i)==a.charAt(i-1))
            {
                return false;
            }
        }
        return true;
    }
}