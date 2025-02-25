class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(nums[mid]== nums[mid+1])
            {
                mid=mid-1;
            }
            int leftlen=(mid-start)+1;
            if(leftlen%2==1)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return nums[start];
    }
}
