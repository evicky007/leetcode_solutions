class Solution {
    public int minMoves(int[] nums) 
    {
        int ans =Integer.MAX_VALUE;
        
        for(int x:nums)
        {
            if(ans>x) ans=x;
        }
        int sum=0;
        for(int x:nums)
        {
            sum+=x-ans;
        }
        return sum;

    }
}