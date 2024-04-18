//Reversal approach

class Solution 
{
    public void reverse(int arr[], int start, int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        if(n==0 || (k=k%n)>n)
            return;
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-k-1);
        reverse(nums, 0, n-1);
        
    }    
}