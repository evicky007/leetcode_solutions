class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        for(int i=0;i<matrix.length;i++)
        {
            int l=0;
            int r = matrix[0].length-1;
            while(l<=r)
            {
                int j= l+(r-l)/2;

                if(matrix[i][j] == target) return true;
                else if(matrix[i][j] > target) r=j-1;
                else l=j+1;
            }
        }
        return false;

    }
}