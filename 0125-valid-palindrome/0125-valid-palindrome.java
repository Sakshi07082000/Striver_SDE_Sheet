class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        s = s.replace(" ","");
        s = s.replaceAll("[^a-zA-Z0-9]", "");  //replace non-alphanumeric characters
        
        int last=s.length()-1, first=0;
        
        while(first<=last)
        {
            if(s.charAt(first)!=s.charAt(last))
                return false;
            first++;
            last--;
        }
        return true;
    }
}