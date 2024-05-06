//Brute force approach

// class Solution {
//     public int maxProduct(int[] nums) {
//         if(nums.length == 1)
//             return nums[0];
//         int max = Integer.MIN_VALUE;
// 	    for(int i=0;i<nums.length-1;i++) 
// 	        for(int j=i+1;j<nums.length;j++) {
// 	            int pro = 1;
// 	            for(int k=i;k<=j;k++) 
// 	                pro *= nums[k];
// 	            max = Math.max(max,pro);  }
// 	   return max;  
//     }
// }

class Solution
{
    public int maxProduct(int[] nums)
    {
        int prefix = 1, suffix = 1;
        int maxpro = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) 
        {
            if (prefix == 0) 
                prefix = 1;
            if (suffix == 0) 
                suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length - i - 1];
            maxpro = Math.max(maxpro, Math.max(prefix, suffix));
        }
        return maxpro;
    }
}