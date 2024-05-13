class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        
        if(s.length() != t.length())
            return false;
        
        HashMap <Character, Character> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char strs = s.charAt(i);               //characters in string s
            char strt = t.charAt(i);              //characters in string t
            
            if(!map.containsKey(strs))
            {
                if(!map.containsValue(strt))
                    map.put(strs, strt);        //if map not already contain key or value then put
                else
                    return false;
            }
            else
            {
                char ch = map.get(strs);    //ch will contain value of g, ie d 
                if(ch != strt)
                    return false;
            }
        }
        return true;
    }
}