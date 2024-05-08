//using split function

class Solution 
{
    public String reverseWords(String s) 
    {
        //all the words separated by space will become separate elements of array
        String[] words = s.split(" ");               
        StringBuilder result = new StringBuilder();
        
        for(int i=words.length-1;i>=0;i--)
        {
            if(words[i].length() == 0)
                continue;
            if(result.length() == 0)       // if thr result is empty then simply add
                result.append(words[i]);
            else
            {
                result.append(" ");         //else add a space then next word
                result.append(words[i]);
            }
        }
        return result.toString();
    }
}