//Brute force approach

class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int j=0, k=0, n=nums.length;
        int pos[]=new int[n];
        int neg[]=new int[n];
        for(int i=0; i<n; i++)
        {
            if(nums[i]>0)
                pos[j++]=nums[i];
            else if(nums[i]<0)
                neg[k++]=nums[i];
        }
        int l=0, m=0;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
                nums[i]=pos[l++];
            else
                nums[i]=neg[m++];
        }
        return nums;
    }
}