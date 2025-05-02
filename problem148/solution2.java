class Solution {
    public int lowerBound(int[] nums, int x) {

      int start=0;
      int end=nums.length-1;
      while(start<=end)
      {
        int mid=(start+end)/2;
        if(nums[mid]>=x)
        {
            return mid;
        }
        else if(x<nums[mid])
        {
            end=mid-1;
        }
        else{
            start=start+1;
        }
      }

    return nums.length;      
     }
}
