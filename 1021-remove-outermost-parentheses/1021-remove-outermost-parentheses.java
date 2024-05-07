class Solution 
{
    public String removeOuterParentheses(String s) 
    {
        String sb="";
        int count = 0;
        
        if(s == "")           //check for empty string
            return s;
        
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(')   //count is increased for every open parentheses
                count++;
            if(count > 1)
                sb = sb + s.charAt(i);
            if(s.charAt(i) == ')')    //count is increased for every close parentheses
                count--;
        }
        return sb;
    }
}