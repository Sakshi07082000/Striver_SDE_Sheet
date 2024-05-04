//Binary search approach

class Solution 
{
    public boolean Binarysearch(int[] arr, int target)
    {
        int low=0, high=arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==target)
                return true;
            if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row= matrix.length;
        
        for(int i=0; i<row; i++)
        {
            boolean flag = Binarysearch(matrix[i], target);
            if(flag == true)
                return true;
        }
        return false;
    }
}