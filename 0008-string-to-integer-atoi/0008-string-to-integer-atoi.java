class Solution 
{
    public int myAtoi(String s) 
    {
        int ans=0;
        int i=0;
        int sign=1;
        int max=Integer.MAX_VALUE;   //2147483647
        int min=Integer.MIN_VALUE;
        
        if(s.length()==0)
        {
            return 0;
        }
        
        while(i<s.length() && s.charAt(i)==' ')  //check for leading white spaces
        {
            i++;
        }

        if(i<s.length() && (s.charAt(i)=='-'|| s.charAt(i)=='+')) //check for sign
        {
            if(s.charAt(i)=='-')
            {
                sign = -1;
            }
            i++;
        }   
        while(i<s.length() && s.charAt(i)-'0'<=9 && s.charAt(i)-'0'>=0) //check for integer
        {
            int digit = s.charAt(i)-'0'; //if integer, save it in digit
            
            if(ans>max/10 || (ans==max/10 && digit>7)) //check for overflow condition
            {
                return (sign == 1) ? max : min;            
            }
            ans=ans*10 + digit; //if no overflow add to answer
            i++;
        }
        return ans*sign; //return ans with sign
    }
}