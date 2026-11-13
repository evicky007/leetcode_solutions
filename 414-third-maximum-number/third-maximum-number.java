class Solution {
    public int thirdMax(int[] nums) 
    {
         int max1 = Integer.MIN_VALUE ;
         int max2 = Integer.MIN_VALUE ;
         int max3 = Integer.MIN_VALUE;
         int f=0;
         Set <Integer> set = new HashSet<>();
       for(int x:nums)
       {
          set.add(x);
          if(max1<x)
          {
             max3 = max2;
             max2 = max1;
             max1 = x;
          }
          else if(max2<x && max1 != x)
          {
            max3 = max2;
            max2 = x;
          }
          else if(max3<x && max2!=x && max1 != x)
          {
              max3=x;
              
          }
       }
       if(set.size()<3 ) return max1;
       return max3;
    }
}