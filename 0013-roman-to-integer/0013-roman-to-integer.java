class Solution 
{
    public int romanToInt(String s) 
    {
        Map<Character, Integer> mp = new HashMap<>();
        
        //putting (key,values) in map
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        
        int ans = 0;
            
        for(int i=0; i<s.length(); i++)
        {
            //i<s.length()-1 is imp in case of subtraction therefore not included in for
            //since it should run till i<len for addition
            if( i < s.length() - 1 && mp.get(s.charAt(i)) < mp.get(s.charAt(i+1)))
            {
                ans = ans + (mp.get(s.charAt(i+1)) - mp.get(s.charAt(i)));
                i++;  //so that we skip the (i+1)th element
            }   
            
            else
                ans = ans + mp.get(s.charAt(i));  
        }
        return ans;
    }
}