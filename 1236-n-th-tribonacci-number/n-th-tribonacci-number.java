class Solution {
    public int tribonacci(int n) 
    {
        
        long t0=0,t1=1,t2=1,t3=0;
        if(n==0) return 0;
        if(n<=2) return 1;
        int i=3;
        while(i<=n)
        {
           t3=t2+t1+t0;
           t0=t1;
           t1=t2;
           t2=t3;

           i++;
        }
        return (int)t2;
        
    }
}