class Solution {
    public boolean isPalindrome(String s) 
    {
       StringBuilder ans = new StringBuilder("");
       int n = s.length();
       for(int i=0;i<n;i++)
       {
           if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
           {
              ans.append(Character.toLowerCase(s.charAt(i)));
           }
           else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
           {
             ans.append(s.charAt(i));
           }
       } 
       int l=0;
       int r=ans.length()-1;
       while(l<r)
       {
          if(ans.charAt(l) != ans.charAt(r))
          {
            return false;

          }
          l++;
          r--;

       }
       return true;

    }
}