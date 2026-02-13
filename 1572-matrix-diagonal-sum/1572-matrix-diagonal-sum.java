class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        if(mat.length == 1 || mat[0].length == 1)
        {
            sum = sum + mat[0][0];
            return sum;
        }
        int j = mat.length-1;
        for(int i=0;i<mat.length;i++)
        {
            sum = sum + mat[i][i] + mat[j][j];
            j--;
        }
        if(mat.length%2==0)
        {
            return sum;
        }
        else
        {
            sum = sum - mat[(mat.length-1)/2][(mat.length-1)/2];
            return sum;
        }
    }
}