class Solution 
{
    public int totalNumbers(int[] digit)
    {
        int n = digit.length;
        int num =0;
        boolean [] visit= new boolean [1000];
        int count=0;

        for(int i=0;i<n;i++)
        {
            if(digit[i]!=0)
            {
               for(int j=0;j<n;j++)
               { 
                 if(j!=i)
                 {
                     for(int k=0;k<n;k++)
                     {
                        if(k!=i && j!=k && digit[k]%2==0)
                        {
                            num = digit[i]*100+digit[j]*10+digit[k];

                            if(!  visit[num])
                        {
                            count++;
                            visit[num] =true;
                        }

                        }

                        
                     }
                 }


               }


            }
        }
        return count;

    }
}