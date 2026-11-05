class Solution {
    public int minMoves(int[] nums) 
    {
        int max = Integer.MIN_VALUE;
       for(int x:nums)
       {
         if(max<x) max=x;
       }
       int sum =0;
       for(int x:nums)
       {
          sum += (max-x);
       }
      return sum;

    }

}