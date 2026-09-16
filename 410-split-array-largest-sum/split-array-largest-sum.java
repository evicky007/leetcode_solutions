class Solution {
    public int splitArray(int[] nums, int k) 
    {
        int n =nums.length;
        int l=0,r=0;
        for(int i =0;i<n;i++)
        {
            l=Math.max(l,nums[i]);
            r+=nums[i];
        }
        int min =100;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            int sum=0,c=1;
            int max=0;
            for(int i=0;i<n;i++)
            {
                if(sum+nums[i] <= mid)
                {
                    sum+=nums[i];
                }
                else
                {
                   max=Math.max(max,sum);
                   sum=nums[i];
                   c++;
                }

                
            }
             max=Math.max(max,sum);
             if(c==k) min=Math.min(min,max);

            if(c>k) l=mid+1;
            else r=mid-1;
        }
        return l;
    }
}