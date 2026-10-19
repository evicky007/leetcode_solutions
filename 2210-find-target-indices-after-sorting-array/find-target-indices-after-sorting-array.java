class Solution {
    public List<Integer> targetIndices(int[] nums, int target)
    {
        List <Integer> ls = new ArrayList <>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i=0;i<n;i++)
        {
            if(target==nums[i])
            {
                while(i<n && target==nums[i])
                {
                    ls.add(i);
                    i++;
                }
                break;
            } 
        }
        return ls;
    }
}