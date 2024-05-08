//Keep checking form behind, as sson as we get an odd no, stop and return all the numbers ahead of that number as it will be the largest odd no

class Solution 
{
    public String largestOddNumber(String num) 
    {
        for(int i=num.length()-1; i>=0; i--)
        {
            if(num.charAt(i) % 2 != 0)
            {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}