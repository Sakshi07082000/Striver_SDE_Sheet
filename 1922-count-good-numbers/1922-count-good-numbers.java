class Solution 
{
    public long MOD = 1_000_000_007;
    
    public int countGoodNumbers(long n) 
    {
        long even = (n+1)/2;
        long odd = n/2;
        long first = power(5, even)%MOD;
        long second = power(4, odd)%MOD;
        
        return (int)((first*second)%MOD);
    }
    
    public long power(long base, long pow)
    {
        if(pow == 0)
            return 1;
        long temp = power(base, pow/2)%MOD;
        
        if(pow % 2 == 0)
            return (temp * temp)%MOD;
        else
            return (base * temp * temp)%MOD;
    }
}