class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int res[]=new int[2];
        res[0]=searchFirst(nums,target);
        res[1]=searchLast(nums,target);
        return res;
    }

    public int searchFirst(int nums[],int target)
    {
        int first=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                first= i;
                break;
            }
        }
        return first;
    }
    public int searchLast(int nums[],int target)
    {
        int last=-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                last=i;
                break;
            }
        }
        return last;
    }
}
