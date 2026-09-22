class Solution {
    public boolean hasSpecialSubstring(String s, int k) 
    {
        int n = s.length();
        if(n==1) return true;
        int l =1;
        char c =' ';
        for(int i=0;i<n;i++)
        {
            if(c==s.charAt(i)) l++;
            else 
            {
                l=1;
                c=s.charAt(i);
            }

            if(l==k)
            {
                if(i<n-1 && c!=s.charAt(i+1)) return true;
                else if(i==n-1) return true;
            }
        }
        return false;
    }
}