class Solution 
{
    public int findContentChildren(int[] g, int[] s) 
    {
         Arrays.sort(g);
         Arrays.sort(s);
         int st=0;
         int count =0;
         for(int i=0;i<g.length;i++)
         {
             while(st<s.length)
             {
                if(s[st]>=g[i])
                {
                    count++;
                    st++;
                    break;
                }
                st++;
             }
         }
        return count;
    }
}