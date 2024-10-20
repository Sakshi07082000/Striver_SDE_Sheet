class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        
        //loop till lrngth of string
        for(int i =0; i<s.length(); i++)
        //for(char ch : s.toCharArray()) replace all ch[i] with ch (faster)
        {
            //converting string to a character array
            char ch[] = s.toCharArray();
            //for every opening bracket in array, push closing bracket to st
            if(ch[i] == '(')
                st.push(')');
            else if(ch[i] == '[')
                st.push(']');
            else if(ch[i] == '{')
                st.push('}');
            
            //if closing bracet encountered in aaray, pop last elem from stack and check if equal to encountered closing bracket
            else if(st.isEmpty() || ch[i] != st.pop())
                    return false;
        }
        return st.isEmpty();
    }
}