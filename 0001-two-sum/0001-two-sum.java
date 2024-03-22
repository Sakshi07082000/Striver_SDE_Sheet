//Two Pointer Approach
//This gives TLE

//class Solution {
//    public int[] twoSum(int[] nums, int target) {        
//        Arrays.sort(nums);
//        int arr[]=new int[2];
//        int left = 0, right= nums.length-1;        
//        while(left<right) {
//            int sum = nums[left] + nums[right];
//            if(sum==target) {
//                arr[0]=left;
//                arr[1]=right; }
//            else if(sum<target)  left++;
//            else  right--; }
//        return arr; } }

//Brute Force
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int arr[]=new int[2];
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}

//Two Pointer Approach
//This gives TLE

//class Solution {
//    public int[] twoSum(int[] nums, int target) {        
//        Arrays.sort(nums);
//        int arr[]=new int[2];
//        int left = 0, right= nums.length-1;        
//        while(left<right) {
//            int sum = nums[left] + nums[right];
//            if(sum==target) {
//                arr[0]=left;
//                arr[1]=right; }
//            else if(sum<target)  left++;
//            else  right--; }
//        return arr; } }