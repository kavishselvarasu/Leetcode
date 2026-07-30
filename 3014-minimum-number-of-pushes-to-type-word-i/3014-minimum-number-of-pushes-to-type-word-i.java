class Solution {
    public int minimumPushes(String word) {
        int count = 0;
        if(word.length() <= 8)
        {
            count = word.length();
        }
        else if(word.length() <= 16 && word.length() > 8)
        {
            count = word.length() + (word.length() - 8);
        }
        else if(word.length() <= 24 && word.length() > 16)
        {
            count = word.length() + (word.length() - 8) + (word.length() - 16);
        }
        else
        {
            count = word.length() + (word.length() - 8) + (word.length() - 16) + (word.length() - 24);
        }
        return count;
    }
}