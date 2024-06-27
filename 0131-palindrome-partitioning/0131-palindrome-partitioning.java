class Solution {
    public List<List<String>> partition(String s) 
    {
        List<List<String>> answer = new ArrayList<>();
        List<String> current = new ArrayList<>();
        palinpart(0, s, current, answer);
        return answer;
    }
    
    void palinpart(int ind, String s, List<String> current, List<List<String>> answer)
    {
        if(ind==s.length())
        {
            answer.add(new ArrayList(current));
            return;
        }
        
        for(int i=ind; i<s.length(); i++)
        {
            if(palin(s, ind, i))
            {
                current.add(s.substring(ind, i+1));
                palinpart(i+1, s, current, answer);
                current.remove(current.size()-1);
            }
        }
        
    }
    
    boolean palin(String s, int start, int end)
    {
        while(start<=end)
        {
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }    
        return true;
    }
}