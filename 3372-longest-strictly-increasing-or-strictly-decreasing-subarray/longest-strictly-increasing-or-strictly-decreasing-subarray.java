class Solution {
    public int longestMonotonicSubarray(int[] nums) 
    {
        int inc = -1;
        int dec = -1;
        int left=0;
        int right=0;
        int max=1;
        if(nums.length<2) return 1;
        if(nums[0]<nums[1])
        {
           inc=1;
        }
        else dec=1;
        int st=0;
        while(st<nums.length-1)
        {
            if(nums[st] == nums[st+1])
            {
                st++;
                continue;  
            }
            
            else if( nums[st]<nums[st+1]) inc=1;
            else dec=1;

            break;
        }
         left=st;
         st+=1;
        System.out.println(st);
        int n=nums.length;
        for(int i=st;i<nums.length;i++)
        {
            
            if(inc==1)
            {
                if(nums[i]>nums[i-1])
                {
                    right=i;
                }
                else if(nums[i]==nums[i-1])
                {
                    left=i;
                    if(i<n-1 &&nums[i]<nums[i+1])
                    {
                        inc=1;
                        dec=-1;
                    }
                    if(i<n-1 && nums[i]>nums[i+1])
                    {
                        dec=1;
                        inc=-1;
                    } 
                }
                else
                {
                    left=i-1;
                    dec=1;
                    inc=-1;
                }
            }
            else
            {
                if(nums[i]<nums[i-1])
                {
                    right=i;
                }
                 else if(nums[i]==nums[i-1])
                {
                    left=i;
                    if(i<n-1 &&nums[i]<nums[i+1])
                    {
                        inc=1;
                        dec=-1;
                    }
                    if(i<n-1 && nums[i]>nums[i+1])
                    {
                        dec=1;
                        inc=-1;
                    } 
                }
                else
                {
                    left=i-1;
                    inc=1;
                    dec=-1;
                }
            }

            if(max<right-left+1) max=right-left+1;
        }

        return max;
        
    }
}