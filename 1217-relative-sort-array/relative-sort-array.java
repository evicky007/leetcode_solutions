class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int n = arr1.length;
        int m = arr2.length;
        Arrays.sort(arr1);
        int[] ans = new int[n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr2[i] == arr1[j]) 
                {
                    ans[k++]=arr1[j];
                    arr1[j]=-1;
                }
            }


        }
        while(k<n)
        {
            int i=0;
            while(true)
            {
                if(arr1[i]!=-1) 
                {
                    ans[k]=arr1[i];
                    arr1[i]=-1;
                    break;
                }
                i++;
            
            }
            k++;
        }
        return ans;
    }
}