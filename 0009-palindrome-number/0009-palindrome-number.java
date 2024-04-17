class Solution 
{
    public boolean isPalindrome(int x) 
    {
        long rev = 0;
        long temp = x;
        
        if (x < 0) 
        {
            return false;
        }

        while (temp != 0) 
        {
            int d = (int)(temp % 10);
            rev = rev * 10 + d;
            temp = temp/10;
        }

        return (x==rev);
    }
}