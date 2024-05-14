class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==goal.charAt(0))
            {
                count=i;
                
                String ans = s.substring(count, s.length()) + s.substring(0, count);
                if(ans.equals(goal))
                    return true;
            }
        }
        
        return false;
    }
}