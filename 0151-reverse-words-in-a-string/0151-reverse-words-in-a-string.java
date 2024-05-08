//using split function

class Solution 
{
    public String reverseWords(String s) 
    {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for(int i=words.length-1;i>=0;i--)
        {
            if(words[i].length() == 0)
                continue;
            if(result.length() == 0)
                result.append(words[i]);
            else
            {
                result.append(" ");
                result.append(words[i]);
            }
        }
        return result.toString();
    }
}