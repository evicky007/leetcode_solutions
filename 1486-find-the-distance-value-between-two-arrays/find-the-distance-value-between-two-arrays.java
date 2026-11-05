class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) 
    {
        int ans = arr1.length;
        int m=ans;
        int n = arr2.length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(Math.abs(arr1[i]-arr2[j]) <= d)
                {
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }
}