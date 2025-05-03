class Solution {
    public int[] searchRange(int[] nums, int target) {

       int arr[]=new int[2];
        arr[0]=searchFirst(nums,target);
        arr[1]=searchLast(nums,target);
       return arr;
    }
    public int searchFirst(int nums[],int target)
    {
        int first=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                first=mid;
                end=mid-1;
            }
            else if(nums[mid]>=target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return first;
    }
    public int searchLast(int nums[],int target)
    {
        int last=-1;
        int start=0;
        int end=nums.length-1;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                last=mid;
                start=mid+1;
            }
            else if(nums[mid]>=target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return last;
    } 
}
