class Solution {
    public void moveZeroes(int[] nums) 
    {
        Stack <Integer> st = new Stack<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0) st.add(nums[i]);
            nums[i]=0;
        }
        int i=0;
        for(int x : st)
        {
            nums[i]=x;
            i++;
        }
    }
}