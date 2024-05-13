class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        //String builder makes cpde faster
        StringBuilder sbS = new StringBuilder(s);
        StringBuilder sbT = new StringBuilder(t);
        
        if(sbS.length() != sbT.length())
            return false;
        
        HashMap <Character, Character> map = new HashMap<>();
        
        for(int i=0; i<sbS.length(); i++)
        {
            char strs = sbS.charAt(i);               //characters in string s
            char strt = sbT.charAt(i);              //characters in string t
            
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