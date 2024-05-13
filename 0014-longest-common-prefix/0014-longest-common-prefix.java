class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if (strs == null || strs.length == 0)
            return "";
        
        Arrays.sort(strs);                        // flight, flow, flower
        String first = strs[0];                  //at 0th index we have flight
        String last = strs[strs.length - 1];    //here we have flower
        
        int c = 0;
        while(c < first.length())        //counter is les than the length of first word
        {
            if (first.charAt(c) == last.charAt(c))   //since sorted, compare first and last
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);    //if c=0 return null else substring 
    }
}