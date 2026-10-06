class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int[][] res = new int[r][c];
        res = matrix;
        int k[]=new int[r];
         int l[]=new int[c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(res[i][j] ==0)
                {
                    k[i]=1;
                    l[j]=1;
                }
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(k[i]==1 || l[j]==1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}