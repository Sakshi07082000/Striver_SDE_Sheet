class Solution 
{
    public int reverse(int x) 
    {
        int num = Math.abs(x);  //Save the absolute value of x in num
        int reverse=0;
        
        while(num != 0)
        {
            int d = num%10;
            if (reverse > (Integer.MAX_VALUE - d) / 10)   //overflow check
            {
                return 0; 
            }

            reverse = reverse*10 + d;
            num = num/10;
        }
        
        return (x<0) ? (-reverse) : (reverse);
    }
}