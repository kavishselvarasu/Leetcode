class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s = 0;
        int r;
        int p =0;
        p += x;
        while (p != 0) {
            r = p % 10;
            s = s + r;
            p = p / 10;
        }
        if (x % s == 0) {
            return s;
        } 
        else {
            return -1;
        }
    }
}