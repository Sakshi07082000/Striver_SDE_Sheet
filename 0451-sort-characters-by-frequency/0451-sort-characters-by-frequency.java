class Solution 
{
    public String frequencySort(String s) 
    {
        Map <Character, Integer> map = new HashMap<>(); //maps key(character) and value(integer)
        
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))            // if key already present
                map.put(s.charAt(i), map.get(s.charAt(i))+1);   //increase the value by 1
            
            else
                map.put(s.charAt(i),1);    //else put both key and value
        }
        
        //Creating a list of all the characters in the map
        List <Character> list = new ArrayList<>(map.keySet());
        
        //Characters(a,b) are being sorted based on their frequencies
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));
        System.out.print(list);
        
        StringBuilder sb = new StringBuilder();
        
        //iterating through the characters in list
        for(Character ch : list)
        {
            //itefating till the frequency of each character
            for(int i=0; i<map.get(ch); i++)
                sb.append(ch);
        }
        return sb.toString();
    }
}