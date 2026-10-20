class Solution {
    public String largestOddNumber(String num) 
    {
        int n = num.length();
        int r=-1;
        for(int i=n-1;i>=0;i--)
        {
            if((num.charAt(i)-'0')%2 == 1) 
            {
                r=i;
                break;
            }
        }

        return num.substring(0,r+1);
        
        
    }
}