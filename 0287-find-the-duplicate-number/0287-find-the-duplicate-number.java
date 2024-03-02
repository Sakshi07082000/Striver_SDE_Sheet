//Two pointer approach or hair turtle approach

class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int slow= nums[0];
        int fast= nums[0];
        do                             //do while since initially both are at 0
        {
            slow= nums[slow];         //slow pointer moves by 1
            fast=nums[nums[fast]];    //fast pointer moves by 2
        }while(slow!=fast);            
        fast=nums[0];                  //as sson as slow equals fast move fast to 0
        while(slow!=fast)
        {
            slow=nums[slow];         // now move both by 1, collision point is dup element
            fast=nums[fast];
        }
        return slow;
    }
}