class Solution {
    public boolean isAnagram(String s, String t) {
        int a = s.length();
        int b = t.length();
        if(a!=b)
        {
            return false;
        }
        else
        {
            int count[] = new int[26];
            for(int i=0;i<a;i++)
            {
                count[s.charAt(i)-'a']++;
            }
            for(int j=0;j<b;j++)
            {
                count[t.charAt(j)-'a']--;
            }
            for(int k=0;k<count.length;k++)
            {
            if(count[k]!=0)
            {
                return false;
            }
            }
        }
        return true;
    }
}