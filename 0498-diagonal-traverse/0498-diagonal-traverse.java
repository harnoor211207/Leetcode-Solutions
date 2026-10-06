class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int dir = 0; // 0 => up, 1 => down
        int row = mat.length;
        int col = mat[0].length;
        int left = 0, bottom = row - 1, top = 0, right = col - 1;
        int[] res = new int[row*col];
        int x = 0, y = 0;

        for(int i=0;i<row*col;i++)
        {
            res[i] = mat[x][y];

            if(dir==0){
                if(y==col-1){
                    x++;
                    dir=1;
                }
                else if(x==0){
                    y++;
                    dir=1;
                }
                else
                {
                    x--;
                    y++;
                }
            }
            else
            {
                if(x==row-1)
                {
                    y++;
                    dir=0;
                }
                else if(y==0)
                {
                    x++;
                    dir=0;
                }
                else{
                    x++;
                    y--;
                }
            }
            }
            return res;
        }
        }
