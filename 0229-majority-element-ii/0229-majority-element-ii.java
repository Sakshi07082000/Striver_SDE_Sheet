//Moore's algorithm

class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        //counters for the two elements
        int c1=0, c2=0, e1=0, e2=0;
        List<Integer> list = new ArrayList<Integer>();
        
        //Algorithm
        for(int i=0; i<nums.length; i++)
        {
            if(c1==0 && nums[i]!=e2)
            {
                c1=1;
                e1=nums[i];
            }
            else if(c2==0 && nums[i]!=e1)
            {
                c2=1;
                e2=nums[i];
            }
            else if(nums[i]==e1)
                c1++;
            else if(nums[i]==e2)
                c2++;
            else
            {c1--; 
             c2--;}
        }
        
        int count1=0, count2=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==e1)
                count1++;
            else if(nums[i]==e2)
                count2++;
        }
        
        if(count1 > (nums.length/3))
            list.add(e1);
        if(count2 > (nums.length/3))
            list.add(e2);
        
        return list;
    }
}